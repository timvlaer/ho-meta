package be.scoutsengidsenvlaanderen.herfstontmoeting;

import be.scoutsengidsenvlaanderen.herfstontmoeting.domain.Activity;
import be.scoutsengidsenvlaanderen.herfstontmoeting.domain.ActivityRepository;
import be.scoutsengidsenvlaanderen.herfstontmoeting.domain.Gouw;
import be.scoutsengidsenvlaanderen.herfstontmoeting.domain.GouwRepository;
import be.scoutsengidsenvlaanderen.herfstontmoeting.json.DateTimeSerializer;
import com.google.common.base.Charsets;
import com.google.common.base.Strings;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import static com.google.common.base.Preconditions.checkState;

public class GenerateStaticFiles {

    private final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .registerTypeAdapter(LocalDateTime.class, new DateTimeSerializer())
            .create();

    private final File outputFile;

    GenerateStaticFiles(String outputPath) {
        this.outputFile = new File(outputPath);
        checkState(this.outputFile.exists() && this.outputFile.isDirectory(), "Output directory doesn't exist");
    }

    public static void main(String[] args) throws IOException {
        checkState(args.length == 1 && !Strings.isNullOrEmpty(args[0]), "Provide output directory as program argument.");
        new GenerateStaticFiles(args[0]).generate();
    }

    private void generate() throws IOException {
        List<Gouw> gouwen = new GouwRepository().getGouwen();
        Files.write(gson.toJson(gouwen), new File(this.outputFile, "gouwen.json"), Charsets.UTF_8);

        List<Activity> activities = new ActivityRepository().getActivities();
        Files.write(gson.toJson(activities), new File(this.outputFile, "activities.json"), Charsets.UTF_8);
    }

}
