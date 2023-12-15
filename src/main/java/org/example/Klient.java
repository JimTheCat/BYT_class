package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Klient extends Osoba implements IKlient{

    protected static HashMap<String, Long> uzytkownicy;
    protected String haslo;
    protected String login;
    protected long pesel;
    protected ArrayList<Rezerwacja> listaRezerwacji;

    private Klient(String imie, String nazwisko, LocalDate dataUrodzenia, String haslo, String login, long pesel) {
        super(imie, nazwisko, dataUrodzenia);
        this.haslo = haslo;
        this.login = login;
        this.pesel = pesel;
        listaRezerwacji = new ArrayList<>();
    }


    @Override
    public Klient utwórzKonto(String imie, String nazwisko, LocalDate dataUrodzenia, String haslo, String login, long pesel) {
        return new Klient(imie, nazwisko, dataUrodzenia, haslo, login, pesel);
    }

    @Override
    public void edytuj(String imie, String nazwisko, LocalDate dataUrodzenia, String haslo, String login, long pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.haslo = haslo;
        this.login = login;
        this.pesel = pesel;
    }

    @Override
    public Klient usun() {
        return null;
    }
}
