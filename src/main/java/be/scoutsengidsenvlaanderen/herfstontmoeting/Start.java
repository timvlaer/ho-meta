package be.scoutsengidsenvlaanderen.herfstontmoeting;

import com.google.common.primitives.Ints;
import io.vertx.core.Vertx;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import java.io.IOException;

import static com.google.common.base.Preconditions.checkArgument;

public class Start {

    static {
        System.setProperty("vertx.logger-delegate-factory-class-name", "io.vertx.core.logging.SLF4JLogDelegateFactory");
    }

    public static void main(String[] args) throws IOException {
        checkArgument(args.length >= 1, "Provide a port number as first arg.");
        Integer port = Ints.tryParse(args[0]);
        checkArgument(port != null, "Provide a port number as first arg.");

        Logger logger = LoggerFactory.getLogger(Start.class);
        logger.info("Application will start at port " + port);

        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new RestApi(port));
    }

}
