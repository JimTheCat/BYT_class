package org.example;

import java.util.List;

public class Przewoźnik {

    protected String adresSiedziby;
    protected String nazwa;
    protected List<Samolot> samolotList;

    private Przewoźnik(String adresSiedziby, String nazwa, List<Samolot> samolotList) {
        this.adresSiedziby = adresSiedziby;
        this.nazwa = nazwa;
    }

    public static Przewoźnik dodajPrzewoźnika(String adresSiedziby, String nazwa, List<Samolot> samolotList){
        if (samolotList.size() < 1) {
            throw new IllegalArgumentException("Niepoprawna liczba samolotów");
        }
        return new Przewoźnik(adresSiedziby, nazwa, samolotList);
    }

    public void edytujPrzewoźnika(String adresSiedziby, String nazwa){
        this.adresSiedziby = adresSiedziby;
        this.nazwa = nazwa;
    }

    public Przewoźnik usuńPrzewoźnika(){
        return null;
    }
}
