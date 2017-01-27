package be.scoutsengidsenvlaanderen.herfstontmoeting.domain;

import com.google.common.collect.ImmutableList;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class ActiviteitRepository {

    private static final String GOUW_GROND = "Gouwgrond";
    private static final String KKG = "KKG";
    private static final LocalDate WEEKEND_START = LocalDate.of(2017, 8, 25);
    private static final String VRIJDAG = "Vrijdag";

    private final ImmutableList<Activiteit> activities = ImmutableList.of(
            Activiteit.builder().setLogicalGroup(VRIJDAG).setName("Aankomst").setDescription("Aankomst en inschrijving").setStartDateTime(friday(19, 0)).build(),
            Activiteit.builder().setLogicalGroup(VRIJDAG).setName("Installeren").setDescription("Tentje opzetten, matje uitrollen").setLocation(GOUW_GROND).setStartDateTime(friday(20, 0)).build(),
            Activiteit.builder().setLogicalGroup(VRIJDAG).setName("Openingsshow").setDescription("Openingsshow op het grote podium").setLocation(KKG).setStartDateTime(friday(23, 15)).setStopDateTime(saturday(0, 0)).build(),
            Activiteit.builder().setLogicalGroup(VRIJDAG).setName("Scouteske avond").setDescription("Scouteske avond met animo, kampvuur en café").setStartDateTime(saturday(0, 0)).setStopDateTime(saturday(2, 30)).build(),
            Activiteit.builder().setLogicalGroup(VRIJDAG).setName("Slaapwel").setDescription("Tijd om in je slaapzak te kruipen").setStartDateTime(saturday(3, 0)).setLocation(GOUW_GROND).build()
    );

    private static LocalDateTime friday(int hour, int minute) {
        return WEEKEND_START.atTime(hour, minute);
    }

    private static LocalDateTime saturday(int hour, int minute) {
        return WEEKEND_START.plusDays(1).atTime(hour, minute);
    }

    public List<Activiteit> getActivities() {
        return activities;
    }

}
