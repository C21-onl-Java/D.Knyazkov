package ru.teachmeskills.homework08;

import ru.teachmeskills.homework08.task1.Iphone;
import ru.teachmeskills.homework08.task2.Pacient;
import ru.teachmeskills.homework08.task2.PlanOfHeal;

public class Main {
    public static void main(String[] args) {


    //Задача 1
    Iphone iphone=new Iphone(11,"mini",400);
    Iphone iphone2=new Iphone(12,"pro",500);
    Iphone iphone3=new Iphone(13,"max",600);
    Iphone[] iphones={iphone,iphone2,iphone3};
        for (Iphone phone:iphones) {
        System.out.println(phone);
    }
        iphone.receiveCall("Александр","+375291023028");
        iphone.sendMesage("+375291023028","+375244023555","+3754637558434");

        //Задача 2
        PlanOfHeal planOfHeal=new PlanOfHeal();
        Pacient pacient=new Pacient();
        planOfHeal.assignDoctor(1,pacient);
        planOfHeal.assignDoctor(2,pacient);
        planOfHeal.assignDoctor(3,pacient);

}
}