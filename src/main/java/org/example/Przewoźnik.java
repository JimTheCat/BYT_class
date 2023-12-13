package org.example;

public class Przewoźnik {

    protected String adresSiedziby;
    protected String nazwa;

    private Przewoźnik(String adresSiedziby, String nazwa) {
        this.adresSiedziby = adresSiedziby;
        this.nazwa = nazwa;
    }

    public static Przewoźnik dodajPrzewoźnika(String adresSiedziby, String nazwa){
        return new Przewoźnik(adresSiedziby, nazwa);
    }

    public void edytujPrzewoźnika(String adresSiedziby, String nazwa){
        this.adresSiedziby = adresSiedziby;
        this.nazwa = nazwa;
    }

    public Przewoźnik usuńPrzewoźnika(){
        return null;
    }
}
