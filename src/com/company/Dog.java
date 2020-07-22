package com.company;

public class Dog extends Animal {
    private int eyes;
    private  int legs;
    private int tile;
    private int teeth;
    private String coat;
    public Dog(int size, int weight, String name, int eyes, int legs, int tile, int teeth, String coat) {
        super(1, 1, size, weight, name);
        this.eyes = eyes;
        this.legs = legs;
        this.tile= tile;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void chew(){
        System.out.println("ŻUJE PIES");
    }

    @Override
    public void eat() {
        System.out.println("ŻRE PIES");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("CHODZI PIES");
        super.move(5);
    }
    public void run(){
        System.out.println("BIEGA PIES");
        move(10);
    }
    private void moveLegs(int speed) {
        System.out.println("PIES RUSZA NOGAMI");
    }

    @Override
    public void move ( int speed){
            System.out.println("RIES RUSZA SIE");
            move(speed);
            super.move(speed);
    }

}
