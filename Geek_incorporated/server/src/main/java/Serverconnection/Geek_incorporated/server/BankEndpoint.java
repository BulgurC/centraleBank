package Serverconnection.Geek_incorporated.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 * Created by thomas on 13-03-17.
 */

@Path("/")
public class BankEndpoint
{
    public static final Logger logger = LoggerFactory.getLogger(BankEndpoint.class);
    /*
     * Mogelijk Http methodes
     * GET      - get something from the server
     * POST     - create something new on the server
     * PUT      - update something on the server
     * DELETE   - remover something from the server
     */

    @GET
    @Path("/balance/{rekeningNr}")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public Serverconnection.Geek_incorporated.server.BalanceResponse getSaldo(@PathParam("rekeningNr") String rekeningNummer)
    {
        Database db = Server.getDatabse();
        logger.trace("in the BankEndpoint::getSaldo()");
        return db.getBalance(rekeningNummer);
    }

    @POST
    @Path("/withdraw")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    @Consumes(MediaType.APPLICATION_JSON)
    public Serverconnection.Geek_incorporated.server.WithdrawResponse withdraw (Serverconnection.Geek_incorporated.server.WithdrawRequest request)
    {
        logger.trace("In de BankEndpoint::withdraw");

        Serverconnection.Geek_incorporated.server.WithdrawResponse response = new Serverconnection.Geek_incorporated.server.WithdrawResponse();

        Database db = Server.getDatabse();
        if (db.withdraw(request.getIBAN(), request.getAmount()))
        {
            response.setResponse("Dank u voor pinnen.");
            response.setNewSaldo(db.getBalance(request.getIBAN()));
            response.setTransactionNumber(12345); // dummy natuurlijk, hier moeten jullie zelf iets beters op verzinnen....
            logger.info("Pinnen is gelukt, niuwe saldo is: " + response.getNewSaldo() + "euro.");
            return response;
        }
        else
        {
            response.setResponse("Saldo ontoereikend.");
            response.setNewSaldo(db.getBalance(request.getIBAN()));
            logger.info("Pinnen is niet gelukt. " + response.getResponse());
            throw new BadRequestException(Response.status(Response.Status.BAD_REQUEST).entity(response).build());
        }
    }
}



