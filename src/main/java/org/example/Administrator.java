package org.example;

import java.time.LocalDate;
import java.util.List;

public class Administrator extends Osoba implements IAdministrator{
    protected String nrKartyPracownika;
    protected List<String> uprawnienia;

    private Administrator(String imie, String nazwisko, LocalDate dataUrodzenia, String nrKartyPracownika, List<String> uprawnienia) {
        super(imie, nazwisko, dataUrodzenia);
        this.nrKartyPracownika = nrKartyPracownika;
        this.uprawnienia = uprawnienia;
    }

    @Override
    public Administrator dodaj(String imie, String nazwisko, LocalDate dataUrodzenia, String nrKartyPracownika, List<String> uprawnienia) {
        return new Administrator(imie, nazwisko, dataUrodzenia, nrKartyPracownika, uprawnienia);
    }

    @Override
    public void edytuj(String nrKartyPracownika, List<String> uprawnienia) {
        this.nrKartyPracownika = nrKartyPracownika;
        this.uprawnienia = uprawnienia;
    }

    @Override
    public Administrator usun() {
        return null;
    }
}
