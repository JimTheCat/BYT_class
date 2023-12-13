package org.example;

import java.time.LocalDate;

public interface IKlient {
    Klient utwórzKonto(String imie, String nazwisko, LocalDate dataUrodzenia, String haslo, String login, long pesel);
    void edytuj(String imie, String nazwisko, LocalDate dataUrodzenia, String haslo, String login, long pesel);
}
