package ru.teachmeskills.homework06;

public class Main {
    public static void main(String[] args) {
        //Проверка задачи 1
        CreditCard cardOne=new CreditCard("BY07ATOM12010028190630000000",320.57);
        CreditCard cardTwo=new CreditCard("BY08ATOM13010028190630000000",1560.00);
        CreditCard cardThree=new CreditCard("BY09ATOM14010028190630000000",55.22);
        cardOne.add(25);
        cardTwo.add(76);
        cardThree.pay(40);
        System.out.println(cardOne);
        System.out.println(cardTwo);
        System.out.println(cardThree);

        //Проверка задачи 2
        Ram ram=new Ram();
        Hdd hdd=new Hdd();
        Computer computer1=new Computer(89.00,"A-800");
Computer computer2=new Computer(1000.00,"C-500",hdd,ram);

        //Проверка алгоритма выдачи сдачи (дополнительная задача)
        Atm atm=new Atm(5,10,15);
        atm.takeCash(525);

        System.out.println(atm);
    }


}


