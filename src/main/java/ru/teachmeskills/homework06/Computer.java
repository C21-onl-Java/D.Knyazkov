package ru.teachmeskills.homework06;

public class Computer {
    private double price;
    private String model;
    private int hdd;
    private String ram;

    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
        Ram ram=new Ram();
        Hdd hdd=new Hdd();
    }

    public Computer(double price, String model, String ram, int hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd =hdd;

    }
    @Override
    public String toString(){
        return String.format("Computer: price-%,.2f, model-%s, ram-%s, hdd -%d",price,model,ram,hdd);

    }
}
