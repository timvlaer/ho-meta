package be.scoutsengidsenvlaanderen.herfstontmoeting.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class GouwTest {
    @Test
    public void getIdentifier() throws Exception {
        assertThat(Gouw.create("ANTWERPEN", "K1").getIdentifier()).isEqualTo("antwerpen");
        assertThat(Gouw.create("Land van Egmont", "K1").getIdentifier()).isEqualTo("land-van-egmont");
        assertThat(Gouw.create("West'brabant", "K1").getIdentifier()).isEqualTo("westbrabant");
    }

}