package nl.hro.sitde.bankalicious.server;

/**
 * Created by elvira on 13-03-17.
 */
public interface Database
{
    long getBalance(String rekeningNr);
    boolean withdraw(String rekeningNr, long amount);
}
