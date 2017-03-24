package nl.hro.sitde.bankalicious.server;

/**
 * Created by elvira on 13-03-17.
 */
public class MockDatabase implements Database
{
    @Override
    public long getBalance(String rekeningNr)
    {
        return 123456789;
    }

    @Override
    public boolean withdraw(String rekeningNr, long amount)
    {
        return true;
    }
}
