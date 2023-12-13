package org.example;

import java.time.LocalDate;
import java.util.List;

public interface IAdministrator {
    Administrator dodaj(String imie, String nazwisko, LocalDate dataUrodzenia, String nrKartyPracownika, List<String> uprawnienia);
    public abstract void edytuj(String nrKartyPracownika, List<String> uprawnienia);
}
