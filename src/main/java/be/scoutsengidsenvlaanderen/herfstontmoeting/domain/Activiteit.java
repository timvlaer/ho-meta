package be.scoutsengidsenvlaanderen.herfstontmoeting.domain;

import com.google.auto.value.AutoValue;

import javax.annotation.Nullable;
import java.time.LocalDateTime;

@AutoValue
public abstract class Activiteit {
    abstract String logicalGroup();
    abstract String name();
    @Nullable abstract String description();
    @Nullable abstract String location();
    abstract LocalDateTime startDateTime();
    @Nullable abstract LocalDateTime stopDateTime();

    static Builder builder() {
        return new AutoValue_Activiteit.Builder();
    }

    @AutoValue.Builder
    abstract static class Builder {
        abstract Builder setLogicalGroup(String value);
        abstract Builder setName(String value);
        abstract Builder setDescription(String value);
        abstract Builder setLocation(String value);
        abstract Builder setStartDateTime(LocalDateTime value);
        abstract Builder setStopDateTime(LocalDateTime value);

        abstract Activiteit build();
    }


}
