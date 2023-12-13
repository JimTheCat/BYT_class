package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public interface IStewardess {
    Stewardess dodaj(String imie, String nazwisko, LocalDate dataUrodzenia, ArrayList<String> kompetencje, ArrayList<String> znaneJezyki);
    void edytuj(String imie, String nazwisko, LocalDate dataUrodzenia, ArrayList<String> kompetencje, ArrayList<String> znaneJezyki);
}
