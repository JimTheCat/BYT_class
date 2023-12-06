package org.example;

import java.time.LocalDate;
import java.util.List;

public class Administrator extends Osoba{
    protected String nrKartyPracownika;
    protected List<String> uprawnienia;

    public Administrator(String imie, String nazwisko, LocalDate dataUrodzenia, String nrKartyPracownika, List<String> uprawnienia) {
        super(imie, nazwisko, dataUrodzenia);
        this.nrKartyPracownika = nrKartyPracownika;
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
