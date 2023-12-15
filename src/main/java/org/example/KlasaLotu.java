package org.example;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class KlasaLotu {

    protected int typ;
    protected ArrayList<MiejscaWKlasie> miejscaWKlasie;

    public KlasaLotu(int typ) {
        this.typ = typ;
        miejscaWKlasie = new ArrayList<>();
    }
}
