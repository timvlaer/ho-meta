package be.scoutsengidsenvlaanderen.herfstontmoeting.domain;

public class Gouw {
    private String name;
    private String location;

    public Gouw(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getIdentifier() {
        return name.toLowerCase()
                .replaceAll("\\p{Zs}", "-")
                .replaceAll("[^0-9a-zA-Z\\-]", "");
    }
}
