package ru.teachmeskills.homework07;

import ru.teachmeskills.homework07.task1.Box;
import ru.teachmeskills.homework07.task2.Accountant;
import ru.teachmeskills.homework07.task2.Director;
import ru.teachmeskills.homework07.task2.Worker;
import ru.teachmeskills.homework07.task3.EmployeeContract;
import ru.teachmeskills.homework07.task3.Invoice;
import ru.teachmeskills.homework07.task3.SupplyContract;

import java.util.Date;

public class Main  {
    public static void main(String[] args) {
        // Проверка задания №1
        double p=0,summ=0;
        Box box=new Box("Параллелограм",4,6);
        Box box1=new Box("Прямоугольник",4,7);
        Box box2=new Box("Квадрат",6,6);
        Box box3=new Box("Ромб",4,4);
        Box box4=new Box("Параллелограм",5,7);
        Box[] boxes={box,box1,box2,box3,box4};
        for (int i = 0; i < boxes.length; i++) {
            p=boxes[i].findToPerimeter();
            summ+=p;
        }
        System.out.println(summ);

        //Проверка задания №2
        Director director=new Director("Директор");
        Worker worker=new Worker("Рабочий");
        Accountant accountant=new Accountant("Бухгалтер");
        director.print(director);
        worker.print(worker);
        accountant.print(accountant);

        //Проверка задания №3

        SupplyContract supplyContract=new SupplyContract(new Date(),5,"электронный",1);
        Invoice invoice=new Invoice(new Date(),2,12,796);
        EmployeeContract employeeContract=new EmployeeContract(new Date(),13,"15-09-2010","17-09-2019");
        supplyContract.saveToDocument(supplyContract);
        employeeContract.saveToDocument(employeeContract);
        invoice.saveToDocument(invoice);
        System.out.println(supplyContract.showToDocument(supplyContract));
        System.out.println(employeeContract.showToDocument(employeeContract));
        System.out.println(invoice.showToDocument(invoice));


    }
}

