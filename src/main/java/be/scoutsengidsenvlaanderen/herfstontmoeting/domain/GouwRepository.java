package be.scoutsengidsenvlaanderen.herfstontmoeting.domain;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.io.Resources;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class GouwRepository {

    private static final URL GOUWEN_RESOURCE = Resources.getResource("gouwen.json");

    private final ImmutableList<Gouw> gouwen;

    public GouwRepository() {
        try {
            Gson gson = new GsonBuilder().create();
            List<Gouw> gouwenFromFile = gson.fromJson(Resources.toString(GOUWEN_RESOURCE, Charsets.UTF_8), new TypeToken<List<Gouw>>() {}.getType());
            this.gouwen = ImmutableList.copyOf(gouwenFromFile);
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to load " + GOUWEN_RESOURCE);
        }
    }

    public List<Gouw> getGouwen() {
        return gouwen;
    }
}
