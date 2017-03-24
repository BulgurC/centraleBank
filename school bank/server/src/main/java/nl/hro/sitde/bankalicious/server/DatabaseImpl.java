package nl.hro.sitde.bankalicious.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

/**
 * Created by elvira on 13-03-17.
 */
public class DatabaseImpl implements Database
{
    private static final Logger logger= LoggerFactory.getLogger(DatabaseImpl.class);

    private Connection con;
    private String host = "jdbc:mysql://localhost:3306/Bankalicious";
    private String uName = "root";
    private String uPass = "*****";
    private ResultSet rs = null;

    public DatabaseImpl()
    {
        this.connect();
    }

    private void connect()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(host, uName, uPass);
            logger.info("Connection to the database is established.");
        }
        catch (Exception e)
        {
            logger.error("Connection to the database failed.", e);
        }

    }

    @Override
    public long getBalance(String rekeningNr)
    {
        long saldo = 0;
        try
        {
            PreparedStatement ps = con.prepareStatement("SELECT saldo "
                                                      + "FROM Bankalicious.klant "
                                                      + "WHERE Bankalicious.klant.rekeningNummer = ?");

            ps.setString(1, rekeningNr);

            rs = ps.executeQuery();
            rs.next();
            saldo = rs.getLong("saldo");
            logger.debug("Saldo = " + saldo);
        }
        catch (SQLException e)
        {
            logger.error("Execution of query select saldo failed.", e);
        }


        return saldo;
    }

    @Override
    public boolean withdraw(String rekeningNr, long amount)
    {
        long saldo = getBalance(rekeningNr);

        try
        {
            if(saldo > amount)
            {
                if(logger.isDebugEnabled())
                {
                    logger.info("Rekening nummer: {}\t saldo: {} ", rekeningNr, saldo);
                }

                PreparedStatement ps = con.prepareStatement("UPDATE Bankalicious.klant "
                        + "SET Bankalicious.klant.saldo = ? "
                        + "WHERE Bankalicious.klant.rekeningNummer = ?;");

                ps.setLong(1, (saldo - amount));
                ps.setString(2, rekeningNr);
                ps.executeUpdate();

                if(logger.isDebugEnabled())
                {
                    logger.info("Nieuwe saldo: {}", getBalance(rekeningNr));
                }
                return true;
            }

            logger.debug("Saldo is ontoereikend op rekeningnummer: {}, huidige saldo: {}",
                    rekeningNr, saldo);
            return false;
        }
        catch (SQLException e)
        {
            logger.error("Execution of query withdraw failed", e);
            return false;
        }
    }
}
