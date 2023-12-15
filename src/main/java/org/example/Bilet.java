package org.example;

public class Bilet {
    protected float cena;
    protected long numer;
    protected KlasaLotu klasaLotu;

    public Bilet(float cena, long numer, KlasaLotu klasaLotu) {
        this.cena = cena;
        this.numer = numer;
        this.klasaLotu = klasaLotu;
    }
}

