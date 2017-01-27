package be.scoutsengidsenvlaanderen.herfstontmoeting.domain;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableList;

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
    abstract ImmutableList<Keuze> keuzes();

    static Builder builder() {
        return new AutoValue_Activiteit.Builder()
                .setKeuzes();
    }

    @AutoValue.Builder
    abstract static class Builder {
        abstract Builder setLogicalGroup(String value);
        abstract Builder setName(String value);
        abstract Builder setDescription(String value);
        abstract Builder setLocation(String value);
        abstract Builder setStartDateTime(LocalDateTime value);
        abstract Builder setStopDateTime(LocalDateTime value);
        abstract Builder setKeuzes(Keuze... value);

        abstract Activiteit build();
    }


}
