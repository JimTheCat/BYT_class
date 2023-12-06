package org.example;

import java.time.LocalDate;
import java.util.HashMap;

public class Klient extends Osoba {

    protected static HashMap<String, Long> urzytkownicy;
    protected String haslo;
    protected String login;
    protected long pesel;

    public Klient(String imie, String nazwisko, LocalDate dataUrodzenia, String haslo, String login, long pesel) {
        super(imie, nazwisko, dataUrodzenia);
        this.haslo = haslo;
        this.login = login;
        this.pesel = pesel;
    }

    public static void utworzKonto(String login, String haslo, long pesel){

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
