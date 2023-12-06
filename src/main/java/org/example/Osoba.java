package org.example;

import java.time.LocalDate;
import java.util.Date;

public abstract class Osoba {
    protected String imie;
    protected String nazwisko;
    protected LocalDate dataUrodzenia;

    public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public abstract void dodaj();
    public abstract void edytuj();
    public abstract void usun();
}
