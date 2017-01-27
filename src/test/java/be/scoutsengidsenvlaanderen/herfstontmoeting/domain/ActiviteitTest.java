package be.scoutsengidsenvlaanderen.herfstontmoeting.domain;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

public class ActiviteitTest {

    @Test
    public void testBuilder() {
        Activiteit activiteit = Activiteit.builder()
                .setLogicalGroup("Vrijdag")
                .setName("test")
                .setStartDateTime(LocalDateTime.now())
                .setStopDateTime(LocalDateTime.now())
                .build();
        assertThat(activiteit.name()).isEqualTo("test");
    }

}
