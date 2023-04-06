package ru.teachmeskills.homework02;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите имя:");
        String name=scanner.nextLine();
        System.out.printf("Вы ввели %s",name);
    }
}
