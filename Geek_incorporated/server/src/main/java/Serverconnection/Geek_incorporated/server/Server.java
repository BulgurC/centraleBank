package Serverconnection.Geek_incorporated.server;

import org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;

/**
 * Created by Thomas on 21-3-2017.
 */

public class Server {
    private static Logger logger = LoggerFactory.getLogger(DatabaseImp.class);
    private static Database DB_INSTANCE;
    private int port = 8025;

    public Server()
    {
        try {
            HttpServer server = initWebserver();
            server.start();
            logger.info("Server is gestart op port " + port);
            while (true) {
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            logger.error("init Webserver is mislukt ", e);
        }
    }

    public static void main(String[] args)
    {
        try
        {
            DB_INSTANCE = (args.length == 1 && args[0].equals("--mock-db"))

                    ? new MockDatabase()
                    : new DatabaseImp();

            logger.info("database instantie is " + DB_INSTANCE.getClass().toString());

            new Server();
        }

        catch (Exception e)
        {
            logger.error("database instantie mislukt :( ", e);
        }
    }

    private HttpServer initWebserver()
    {
        ResourceConfig config = new ResourceConfig(BankEndpoint.class);
        config.register(JacksonJaxbJsonProvider.class);
        URI uri = URI.create("Http://0.0.0.0:" + port);
        return GrizzlyHttpServerFactory.createHttpServer(uri, config, true);
    }

    public static Database getDatabse()
    {
        return DB_INSTANCE;
    }
}


