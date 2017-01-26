package be.scoutsengidsenvlaanderen.herfstontmoeting.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class GouwTest {
    @Test
    public void getIdentifier() throws Exception {
        assertThat(new Gouw("ANTWERPEN", "K1").getIdentifier()).isEqualTo("antwerpen");
        assertThat(new Gouw("Land van Egmont", "K1").getIdentifier()).isEqualTo("land-van-egmont");
        assertThat(new Gouw("West'brabant", "K1").getIdentifier()).isEqualTo("westbrabant");
    }

}