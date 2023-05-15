package ru.teachmeskills.homework08.task1;

public class Iphone {
    int number;
    String model;
    int weight;

    public Iphone() {}

    public Iphone(int number, String model) {
        this.number = number;
        this.model = model;
    }


    public Iphone(int number, String model, int weight) {
        this(number,model);
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.println("Звонит"+" "+name);
    }

    public void receiveCall(String name,String number){
        System.out.println("Звонит"+" "+name+" "+number);
    }

    public String getNumber(){
        return "+375291023028";
    }

    public void sendMesage(String... numbers){
        for (String s:numbers
        ) {
            System.out.println(s);
        }


    }


    @Override
    public String toString() {
        return String.format("Номер:%d, модель:%s, вес:%d",number,model,weight);
    }
}
