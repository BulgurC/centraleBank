package nl.hro.sitde.bankalicious.api;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by elvira on 23-03-17.
 */
public class WithdrawResponse
{
    @JsonProperty
    private String response;
    @JsonProperty
    private long transactionNumber;
    @JsonProperty
    private long newSaldo;

    public String getResponse()
    {
        return response;
    }

    public void setResponse(String response)
    {
        this.response = response;
    }

    public long getTransactionNumber()
    {
        return transactionNumber;
    }

    public void setTransactionNumber(long transactionNumber)
    {
        this.transactionNumber = transactionNumber;
    }

    public long getNewSaldo()
    {
        return newSaldo;
    }

    public void setNewSaldo(long newSaldo)
    {
        this.newSaldo = newSaldo;
    }
}
