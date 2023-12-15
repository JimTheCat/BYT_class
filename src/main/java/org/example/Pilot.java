package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pilot extends Osoba implements IPilot{
    protected long nrLicencjiLot;
    protected ArrayList<String> uprawnienia;
    protected ArrayList<Lot> lotList;

    private Pilot(String imie, String nazwisko, LocalDate dataUrodzenia, long nrLicencjiLot, ArrayList<String> uprawnienia, ArrayList<Lot> lotList) {
        super(imie, nazwisko, dataUrodzenia);
        this.nrLicencjiLot = nrLicencjiLot;
        this.uprawnienia = uprawnienia;
        this.lotList = lotList;
    }

    @Override
    public Pilot dodaj(String imie, String nazwisko, LocalDate dataUrodzenia, long nrLicencjiLot, ArrayList<String> uprawnienia, ArrayList<Lot> lotList) {
        return new Pilot(imie, nazwisko, dataUrodzenia, nrLicencjiLot, uprawnienia, lotList);
    }

    @Override
    public void edytuj(String imie, String nazwisko, LocalDate dataUrodzenia, long nrLicencjiLot, ArrayList<String> uprawnienia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.nrLicencjiLot = nrLicencjiLot;
        this.uprawnienia = uprawnienia;
    }

    @Override
    public Pilot usun() {
        return null;
    }
}
