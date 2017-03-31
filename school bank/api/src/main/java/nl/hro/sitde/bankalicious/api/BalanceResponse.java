package nl.hro.sitde.bankalicious.api;

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

    public long getBalance()
    {
        return balance;
    }

    public void setBalance(long balance)
    {
        this.balance = balance;
    }

    public String getRekeningNummer()
    {
        return rekeningNummer;
    }

    public void setRekeningNummer(String rekeningNummer)
    {
        this.rekeningNummer = rekeningNummer;
    }
}
