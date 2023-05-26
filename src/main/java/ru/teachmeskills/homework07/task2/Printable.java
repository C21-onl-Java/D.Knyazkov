package ru.teachmeskills.homework07.task2;


public interface Printable {
    default  void print(Printable post){
        System.out.println("Должность "+post);

    }
}

