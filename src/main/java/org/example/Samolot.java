package org.example;

public class Samolot {
    private int liczbaMiejsc;
    private String nazwa;
    private String producent;
    private int udzwig;

    private Samolot(int liczbaMiejsc, String nazwa, String producent, int udzwig){
        this.liczbaMiejsc = liczbaMiejsc;
        this.nazwa = nazwa;
        this.producent = producent;
        this.udzwig = udzwig;
    }
    public static Samolot dodajSamolot(int liczbaMiejsc, String nazwa, String producent, int udzwig){
        return new Samolot(liczbaMiejsc, nazwa, producent, udzwig);
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
