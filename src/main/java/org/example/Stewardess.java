package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Stewardess extends Osoba {
        protected ArrayList<String> kompetencje;
        protected ArrayList<String> znaneJezyki;

    public Stewardess(String imie, String nazwisko, LocalDate dataUrodzenia, ArrayList<String> kompetencje, ArrayList<String> znaneJezyki) {
        super(imie, nazwisko, dataUrodzenia);
        this.kompetencje = kompetencje;
        this.znaneJezyki = znaneJezyki;
    }

    @Override
    public void dodaj() {

    }

    @Override
    public void edytuj() {

    }

    @Override
    public void usun() {

    }
}
