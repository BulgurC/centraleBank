package nl.hro.sitde.bankalicious.server;

import org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import java.net.URI;

/**
 * Created by elvira on 13-03-17.
 */
public class Server
{
    private static Logger logger = LoggerFactory.getLogger(DatabaseImpl.class);
    private static Database DB_INSTANCE;
    private int port = 8027;

    public Server() throws Exception
    {
        HttpServer server = initWebserver();
        server.start();
        logger.info("Server is gestart op port " + port);
        while (true)
        {
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) throws Exception
    {
        DB_INSTANCE = (args.length == 1 && args[0].equals("--mock-db"))
                ? new MockDatabase()
                : new DatabaseImpl();

        logger.info("Database instantie is " + DB_INSTANCE.getClass().toString());

        new Server();

    }
    private HttpServer initWebserver()
    {
        ResourceConfig config = new ResourceConfig(BankEndpoint.class);
        config.register(JacksonJaxbJsonProvider.class);
        URI uri = URI.create("http://0.0.0.0:" + port);

         /*
         * Code voor het initialiseren van je HTTP server met SSL connectie
         * Ook de return statement aangepast
         */
//        SSLContextConfigurator sslConf = new SSLContextConfigurator();
//        sslConf.setKeyStoreFile("./keystore_server"); // contains server keypair
//        sslConf.setKeyStorePass("asdfgh");
//        sslConf.setTrustStoreFile("./truststore_server"); // contains client certificate
//        sslConf.setTrustStorePass("asdfgh");

//        return GrizzlyHttpServerFactory.createHttpServer(uri, config, true, new SSLEngineConfigurator(sslConf));


        return GrizzlyHttpServerFactory.createHttpServer(uri,config, true);
    }

    public static Database getDatabase()
    {
        return DB_INSTANCE;
    }
}
