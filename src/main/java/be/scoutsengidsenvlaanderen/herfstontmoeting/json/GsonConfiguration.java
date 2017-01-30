package be.scoutsengidsenvlaanderen.herfstontmoeting.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class GsonConfiguration {

    private final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeSerializer())
            .registerTypeAdapter(LocalTime.class, new LocalTimeSerializer())
            .create();

    public Gson getGson() {
        return gson;
    }
}
