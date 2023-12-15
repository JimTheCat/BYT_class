package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Rezerwacja {

    protected double kwota = 0;
    protected LocalDateTime data;
    protected long numer;
    protected String status;
    protected ArrayList<Lot> listaLotow;
    protected ArrayList<Klient> listaKlientow;

    private Rezerwacja(LocalDateTime data, long numer, String status, ArrayList<Lot> listaLotow, ArrayList<Klient> listaKlientow) {
        this.data = data;
        this.numer = numer;
        this.status = status;
        this.listaLotow = listaLotow;
        this.listaKlientow = listaKlientow;
    }

    public static Rezerwacja zlozRezerwacje(LocalDateTime data, long numer, String status, ArrayList<Lot> listaLotow, ArrayList<Klient> listaKlientow) {
        return new Rezerwacja(data, numer, status, listaLotow, listaKlientow);
    }
    public void oplacRezerwacje(){
        this.status = "oplacona";
    }
    public void wyliczKwoteRezerwacji(double kwota){
        this.kwota = kwota;
    }
}
