package be.scoutsengidsenvlaanderen.herfstontmoeting;

import be.scoutsengidsenvlaanderen.herfstontmoeting.domain.ActiviteitRepository;
import be.scoutsengidsenvlaanderen.herfstontmoeting.domain.GouwRepository;
import be.scoutsengidsenvlaanderen.herfstontmoeting.json.GsonConfiguration;
import com.google.gson.Gson;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;

import java.io.IOException;

public class RestApi extends AbstractVerticle {

    private static final String API_BASE_PATH = "/api/v1";

    private final Gson gson = new GsonConfiguration().getGson();

    private final int port;

    private final GouwRepository gouwRepository = new GouwRepository();
    private final ActiviteitRepository activiteitRepository = new ActiviteitRepository();

    RestApi(int port) throws IOException {
        this.port = port;
    }

    @Override
    public void start() {
        Router router = Router.router(vertx);

        router.route().handler(BodyHandler.create());
        router.get(API_BASE_PATH + "/gouwen").handler(this::listGouwen);
        router.get(API_BASE_PATH + "/activiteiten").handler(this::listActiviteiten);

        HttpServerOptions httpServerOptions = new HttpServerOptions();
        httpServerOptions.setCompressionSupported(true);
        vertx.createHttpServer(httpServerOptions)
                .requestHandler(router::accept)
                .listen(port);
    }

    private void listGouwen(RoutingContext routingContext) {
        routingContext.response()
                .putHeader("content-type", "application/json")
                .end(gson.toJson(gouwRepository.getGouwen()));
    }

    private void listActiviteiten(RoutingContext routingContext) {
        routingContext.response()
                .putHeader("content-type", "application/json")
                .end(gson.toJson(activiteitRepository.getActivities()));
    }

}
