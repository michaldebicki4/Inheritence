package com.company;

public class Car extends Vehicle {
    private String marka;
    private int cena;
    public Car( int rokProdukcji, int iloscKol, int vmax, String marka, int cena) {
        super("Samochod", rokProdukcji, "Car", iloscKol, vmax);
        this.marka = marka;
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public int getCena() {
        return cena;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public void moving() {
        System.out.print(getNazwa() + ": ");
        super.moving();
        System.out.println("Jest także marki: " + marka);
    }
}
