package org.example;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lot {
    protected double czasLotu = 0;
    protected LocalDateTime dataOdlotu;
    protected LocalDateTime dataPrzylotu;
    protected String skad;
    protected String dokad;
    protected long numer;
    protected String status;
    protected List<Stewardess> stewardessList;
    protected Pilot Kapitan;
    protected Pilot pilot;
    protected Samolot samolot;
    protected List<Rezerwacja> rezerwacjaList;

    private Lot(double czasLotu, LocalDateTime dataOdlotu, LocalDateTime dataPrzylotu, String skad, String dokad, long numer, String status, List<Stewardess> stewardessList, Pilot kapitan, Pilot pilot, Samolot samolot, List<Rezerwacja> rezerwacjaList) {
        this.czasLotu = czasLotu;
        this.dataOdlotu = dataOdlotu;
        this.dataPrzylotu = dataPrzylotu;
        this.skad = skad;
        this.dokad = dokad;
        this.numer = numer;
        this.status = status;
        this.stewardessList = stewardessList;
        Kapitan = kapitan;
        this.pilot = pilot;
        this.samolot = samolot;
        this.rezerwacjaList = rezerwacjaList;
    }

    public static Lot dodajLot(double czasLotu, LocalDateTime dataOdlotu, LocalDateTime dataPrzylotu, String skad, String dokad, long numer, String status, List<Stewardess> stewardessList, Pilot kapitan, Pilot pilot, Samolot samolot, List<Rezerwacja> rezerwacjaList) {
        if (stewardessList.size() < 1 && stewardessList.size() > 3) {
            throw new IllegalArgumentException("Niepoprawna liczba stewardess");
        }
        if (Objects.isNull(kapitan)) {
            throw new IllegalArgumentException("Niepoprawny kapitan");
        }
        if (Objects.isNull(pilot)) {
            throw new IllegalArgumentException("Niepoprawny pilot");
        }
        if (Objects.isNull(samolot)) {
            throw new IllegalArgumentException("Niepoprawny samolot");
        }
        return new Lot(czasLotu, dataOdlotu, dataPrzylotu, skad, dokad, numer, status, stewardessList, kapitan, pilot, samolot, rezerwacjaList);
    }

    public void zmienStatus(String status) {
        this.status = status;
    }

    public void zmienDateLotu(LocalDateTime dataOdlotu, LocalDateTime dataPrzylotu) {
        this.dataOdlotu = dataOdlotu;
        this.dataPrzylotu = dataPrzylotu;
    }
}
