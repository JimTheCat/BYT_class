package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public interface IPilot {
    Pilot dodaj(String imie, String nazwisko, LocalDate dataUrodzenia, long nrLicencjiLot, ArrayList<String> uprawnienia);
    void edytuj(String imie, String nazwisko, LocalDate dataUrodzenia, long nrLicencjiLot, ArrayList<String> uprawnienia);
}
