package Serverconnection.Geek_incorporated.server;

/**
 * Created by thomas on 21-3-2017.
 */
public interface Database
{
    long getBalance(String rekeningNr);

    boolean withdraw(String rekeningNr, long amount);



}
