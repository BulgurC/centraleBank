package Serverconnection.Geek_incorporated.server;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by elvira on 23-03-17.
 */
public class BalanceResponse
{
    @JsonProperty
    private long balance;
    @JsonProperty
    private String rekeningNummer;

    public BalanceResponse(String rekeningNummer, long balance)
    {
        this.rekeningNummer = rekeningNummer;
        this.balance = balance;
    }
}