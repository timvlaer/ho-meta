package be.scoutsengidsenvlaanderen.herfstontmoeting.domain;

import com.google.common.collect.ImmutableList;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class ActiviteitRepository {

    private static final String GOUW_GROND = "Gouwgrond";
    private static final String KKG = "KKG";
    private static final LocalDate WEEKEND_START = LocalDate.of(2017, 8, 25);
    private static final String VRIJDAG = "Vrijdag";
    private static final String ZATERDAG = "Zaterdag";

    private final ImmutableList<Activiteit> activities = ImmutableList.of(
            Activiteit.builder().setLogicalGroup(VRIJDAG).setName("Aankomst").setDescription("Aankomst en inschrijving").setStartDateTime(friday(19, 0)).build(),
            Activiteit.builder().setLogicalGroup(VRIJDAG).setName("Installeren").setDescription("Tentje opzetten, matje uitrollen").setLocation(GOUW_GROND).setStartDateTime(friday(20, 0)).build(),
            Activiteit.builder().setLogicalGroup(VRIJDAG).setName("Openingsshow").setDescription("Openingsshow op het grote podium").setLocation(KKG).setStartDateTime(friday(23, 15)).setStopDateTime(saturday(0, 0)).build(),
            Activiteit.builder().setLogicalGroup(VRIJDAG).setName("Scouteske avond").setDescription("Scouteske avond met animo, kampvuur en café").setStartDateTime(saturday(0, 0)).setStopDateTime(saturday(2, 30))
                    .setKeuzes(
                            Keuze.builder().setName("Lindy Hop").setLocation("Hoofdpodium").setStartTime(LocalTime.of(0, 0)).build(),
                            Keuze.builder().setName("Scouteske zangavond").setLocation("Hoofdpodium").setStartTime(LocalTime.of(1, 0)).build(),
                            Keuze.builder().setName("Labyrjinth").setLocation("L341").build(),
                            Keuze.builder().setName("Hoppercafé met karaoke").setLocation("K10").setStartTime(LocalTime.of(0, 0)).build(),
                            Keuze.builder().setName("Hoppercafé met volksdans").setLocation("K10").setStartTime(LocalTime.of(1, 0)).build(),
                            Keuze.builder().setName("Pijl en boog").setLocation("LK10").build()
                    )
                    .build(),
            Activiteit.builder().setLogicalGroup(VRIJDAG).setName("Slaapwel").setDescription("Tijd om in je slaapzak te kruipen").setStartDateTime(saturday(3, 0)).setLocation(GOUW_GROND).build(),

            Activiteit.builder().setLogicalGroup(ZATERDAG).setName("Opstaan").setDescription("Opstaan en ontbijt op je gouwgrond").setStartDateTime(saturday(9, 0)).setLocation(GOUW_GROND).build(),
            Activiteit.builder().setLogicalGroup(ZATERDAG).setName("Gouw- en districtsmoment").setStartDateTime(saturday(9, 0)).setStopDateTime(saturday(11, 0)).setLocation(GOUW_GROND).build(),
            Activiteit.builder().setLogicalGroup(ZATERDAG).setName("Opening van de dag").setStartDateTime(saturday(11, 15)).setStopDateTime(saturday(11, 45)).setLocation(KKG).build()
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
