package be.scoutsengidsenvlaanderen.herfstontmoeting.domain;

import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Optional;

import static com.google.common.base.Preconditions.checkArgument;

public class GouwRepository {

    private final ImmutableList<Gouw> gouwen = ImmutableList.of(
            Gouw.create("Antwerpen", "K1"),
            Gouw.create("Gent", "K6"),
            Gouw.create("Heide", "K5"),
            Gouw.create("Kempen", "K9"),
            Gouw.create("Land van Egmont", "K4"),
            Gouw.create("Limburg", "K3"),
            Gouw.create("Noordzee", "K4"),
            Gouw.create("Oost-Brabant", "K6"),
            Gouw.create("Opsinjoor", "K7"),
            Gouw.create("Waas", "K1"),
            Gouw.create("Webra", "K1"),
            Gouw.create("Zuid-West-Vlaanderen", "K1")
    );

    public List<Gouw> getGouwen() {
        return gouwen;
    }

    public Optional<Gouw> findGouw(String gouwId) {
        checkArgument(!Strings.isNullOrEmpty(gouwId), "Provide a valid identifier");
        return gouwen.stream()
                .filter(g -> gouwId.equals(g.getIdentifier()))
                .findFirst();
    }
}
