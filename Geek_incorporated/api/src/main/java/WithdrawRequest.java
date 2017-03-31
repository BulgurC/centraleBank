package Serverconnection.Geek_incorporated.server;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by thomas on 23-03-17.
 */
public class WithdrawRequest
{
    @JsonProperty
    private String IBAN;
    @JsonProperty
    private long amount;

    public WithdrawRequest()
    {

    }
    public String getIBAN()
    {
        return IBAN;
    }

    public void setIBAN(String IBAN)
    {
        this.IBAN = IBAN;
    }

    public long getAmount()
    {
        return amount;
    }

    public void setAmount(long amount)
    {
        this.amount = amount;
    }
}