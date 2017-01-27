package be.scoutsengidsenvlaanderen.herfstontmoeting.domain;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Gouw {
    abstract String name();
    abstract String location();

    static Gouw create(String name, String location) {
        return new AutoValue_Gouw(name, location);
    }

    public String getIdentifier() {
        return name().toLowerCase()
                .replaceAll("\\p{Zs}", "-")
                .replaceAll("[^0-9a-zA-Z\\-]", "");
    }
}
