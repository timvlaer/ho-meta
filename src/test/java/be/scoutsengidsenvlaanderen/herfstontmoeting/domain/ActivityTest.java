package be.scoutsengidsenvlaanderen.herfstontmoeting.domain;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

public class ActivityTest {

    @Test
    public void testBuilder() {
        Activity activity = Activity.builder()
                .setLogicalGroup("Vrijdag")
                .setName("test")
                .setStartDateTime(LocalDateTime.now())
                .setStopDateTime(LocalDateTime.now())
                .build();
        assertThat(activity.name()).isEqualTo("test");
    }

}
