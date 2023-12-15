package org.example;

import java.util.ArrayList;

public class Samolot {
    private int liczbaMiejsc;
    private String nazwa;
    private String producent;
    private int udzwig;
    protected ArrayList<MiejscaWKlasie> miejscaWKlasie;
    private Przewoźnik przewoźnik;

    private Samolot(int liczbaMiejsc, String nazwa, String producent, int udzwig, Przewoźnik przewoźnik) {
        this.liczbaMiejsc = liczbaMiejsc;
        this.nazwa = nazwa;
        this.producent = producent;
        this.udzwig = udzwig;
        this.przewoźnik = przewoźnik;
        miejscaWKlasie = new ArrayList<>();
    }
    public static Samolot dodajSamolot(int liczbaMiejsc, String nazwa, String producent, int udzwig, Przewoźnik przewoźnik){
        return new Samolot(liczbaMiejsc, nazwa, producent, udzwig, przewoźnik);
    }

    public void edytujSamolot(int liczbaMiejsc, String nazwa, String producent, int udzwig){
        this.liczbaMiejsc = liczbaMiejsc;
        this.nazwa = nazwa;
        this.producent = producent;
        this.udzwig = udzwig;
    }

    public Samolot usunSamolot(){
        return null;
    }
}
