package be.scoutsengidsenvlaanderen.herfstontmoeting.domain;

import com.google.auto.value.AutoValue;

import javax.annotation.Nullable;
import java.time.LocalDateTime;

@AutoValue
public abstract class Keuze {
    abstract String name();
    @Nullable abstract String description();
    abstract String location();

    static Builder builder() {
        return new AutoValue_Keuze.Builder();
    }

    @AutoValue.Builder
    abstract static class Builder {
        abstract Builder setName(String value);
        abstract Builder setDescription(String value);
        abstract Builder setLocation(String value);

        abstract Activiteit build();
    }


}
