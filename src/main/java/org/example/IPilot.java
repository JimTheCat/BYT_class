package org.example;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public interface IPilot {
    Pilot dodaj(String imie, String nazwisko, LocalDate dataUrodzenia, long nrLicencjiLot, ArrayList<String> uprawnienia, ArrayList<Lot> lotList);
    void edytuj(String imie, String nazwisko, LocalDate dataUrodzenia, long nrLicencjiLot, ArrayList<String> uprawnienia);
}
