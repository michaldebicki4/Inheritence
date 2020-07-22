package com.company;

public class Vehicle {
    private String nazwa;
    private int rokProdukcji;
    private String rodzaj;
    private  int iloscKol;
    private int Vmax;

    public Vehicle(String nazwa, int rokProdukcji, String rodzaj, int iloscKol, int vmax) {
        this.nazwa = nazwa;
        this.rokProdukcji = rokProdukcji;
        this.rodzaj = rodzaj;
        this.iloscKol = iloscKol;
        this.Vmax = vmax;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public int getIloscKol() {
        return iloscKol;
    }

    public int getVmax() {
        return Vmax;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public void setIloscKol(int iloscKol) {
        this.iloscKol = iloscKol;
    }

    public void setVmax(int vmax) {
        Vmax = vmax;
    }

    public void moving(){
        System.out.println("RUSZAM SIĘ Z PRĘDKOŚCIOM : " + Vmax);
    }


}

