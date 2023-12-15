package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Stewardess extends Osoba implements IStewardess{
    protected ArrayList<String> kompetencje;
    protected ArrayList<String> znaneJezyki;
    protected ArrayList<Lot> lotList;

    private Stewardess(String imie, String nazwisko, LocalDate dataUrodzenia, ArrayList<String> kompetencje, ArrayList<String> znaneJezyki, ArrayList<Lot> lotList) {
        super(imie, nazwisko, dataUrodzenia);
        this.kompetencje = kompetencje;
        this.znaneJezyki = znaneJezyki;
        this.lotList = lotList;
    }

    @Override
    public Stewardess dodaj(String imie, String nazwisko, LocalDate dataUrodzenia, ArrayList<String> kompetencje, ArrayList<String> znaneJezyki, ArrayList<Lot> lotList) {
        return new Stewardess(imie, nazwisko, dataUrodzenia, kompetencje, znaneJezyki, lotList);
    }

    @Override
    public void edytuj(String imie, String nazwisko, LocalDate dataUrodzenia, ArrayList<String> kompetencje, ArrayList<String> znaneJezyki) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.kompetencje = kompetencje;
        this.znaneJezyki = znaneJezyki;
    }

    @Override
    public Stewardess usun() {
        return null;
    }
}
