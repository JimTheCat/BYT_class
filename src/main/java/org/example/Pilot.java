package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pilot extends Osoba {
    protected long nrLicencjiLot;
    protected ArrayList<String> uprawnienia;

    public Pilot(String imie, String nazwisko, LocalDate dataUrodzenia, long nrLicencjiLot, ArrayList<String> uprawnienia) {
        super(imie, nazwisko, dataUrodzenia);
        this.nrLicencjiLot = nrLicencjiLot;
        this.uprawnienia = uprawnienia;
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
