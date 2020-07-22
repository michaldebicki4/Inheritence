package com.company;

public class Audi extends Car {
    String model;

    public Audi(int rokProdukcji, int vmax, int cena, String model) {
        super(rokProdukcji, 4, vmax,"Audi", cena);
        this.model = model;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void moving() {
        super.moving();
        System.out.println("MODEL AUTA : " + model);

    }
}
