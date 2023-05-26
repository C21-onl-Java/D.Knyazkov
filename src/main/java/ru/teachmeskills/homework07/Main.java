package ru.teachmeskills.homework07;

import ru.teachmeskills.homework07.task1.Box;
import ru.teachmeskills.homework07.task1.Circle;
import ru.teachmeskills.homework07.task1.Figure;
import ru.teachmeskills.homework07.task1.Triangle;
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
        double summ=0;
   Figure figure=new Box("Параллелограм", 4, 6);
   Figure figure1=new Triangle("Треугольник",4,5,7);
   Figure figure2=new Circle("Круг",9);
        Figure[] figures={figure,figure1,figure2};
        for (Figure f:figures
             ) {
            summ+= f.findToPerimeter();
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

