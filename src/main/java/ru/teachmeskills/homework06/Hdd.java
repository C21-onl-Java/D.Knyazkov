package ru.teachmeskills.homework06;

public class Hdd {

    private String name;
    private int volume;
    private String type;

    public Hdd(String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public Hdd() {
    }
    @Override
    public String toString(){
        return "HDD"+name+" "+volume+" "+type;

    }


}