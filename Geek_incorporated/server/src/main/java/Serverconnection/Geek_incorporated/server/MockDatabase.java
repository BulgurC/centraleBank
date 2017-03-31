package Serverconnection.Geek_incorporated.server;

/**
 * Created by thomas on 21-3-2017.
 */
public class MockDatabase implements Database
{
    @Override
    public long getBalance(String rekeningNr)
    {
        return 5000;
    }

    @Override
    public boolean withdraw(String rekeningNr, long amount)
    {
        return true;
    }
}