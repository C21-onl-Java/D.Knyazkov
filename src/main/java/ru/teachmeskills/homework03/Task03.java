package ru.teachmeskills.homework03;

import java.util.Scanner;

public class Task03 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите номер задачи:");
        int task = scanner.nextInt();
        switch (task) {
            case 1:
                seasonSelection();
                break;
            case 2:
                seasonSelection2();
                break;
            case 3:
                evenNumber();
                break;
            case 4:
                temp();
                break;
            case 5:
                rainbow();
                break;
            case 6:
                oddNumbers();
                break;
            case 7:
                decrement();
                break;
            case 8:
                amount();
                break;
            case 9:
                int i = 0;
                while (i < 95) {
                    i += 7;
                    System.out.println(i);
                }
                break;
            case 10:
                for (int j = 0, k = 0; k < 10; j -= 5, k++) {
                    System.out.println(j);
                }
                break;
            case 11:
                for (int j = 10; j <= 20; j++) {
                    System.out.println(j * j);
                }
                break;
            case 12:
                fibonacci();
                break;
            case 13:
                percents();
                break;
            case 14:
                table();
                 break;

            default:
                System.out.println("Что-пошло не так");
        }
    }


    public static void seasonSelection() {
        int month;
        System.out.println("Введите номер месяца:");
        while (true) {
            month = scanner.nextInt();
            if (month < 0 || month > 12) {
                System.out.println("Номер месяца должен находиться в диапазоне от 1 до 12. Попробуйте еще раз.");
            } else
                break;
        }

        switch (month) {
            case 12, 1, 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");

        }
    }

    public static void seasonSelection2() {
        int month;
        System.out.println("Введите номер месяца:");
        while (true) {
            month = scanner.nextInt();
            if (month < 0 || month > 12) {
                System.out.println("Номер месяца должен находиться в диапазоне от 1 до 12. Попробуйте еще раз.");
            } else
                break;
        }
        if (month == 1 || month == 2 || month == 12)
        { System.out.println("Зима");}
        else if (month == 3 || month == 4 || month == 5)
        { System.out.println("Весна");}
        else if (month == 6 || month == 7 || month == 8)
        {System.out.println("Лето");}
        else if (month == 9 || month == 10 || month == 11)
        { System.out.println("Осень");}
    }

    public static void evenNumber() {
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        if (number % 2 == 0)
        {System.out.println("Число четное");}
        else
        {System.out.println("Число нечетное");}

    }

    public static void temp() {
        System.out.println("Введите температуру:");
        int t = scanner.nextInt();
        if (t > -5)
        {System.out.println("Тепло");}
        else if (t < -5 && t > -20)
        {System.out.println("Нормально");}
        else if (t >= -20)
        { System.out.println("Холодно");}
    }

    public static void rainbow() {
        System.out.println("Введите номер цвета радуги:");
        int color = scanner.nextInt();
        switch (color) {
            case 1:
                System.out.println("красный");
                break;
            case 2:
                System.out.println("оранжевый");
                break;
            case 3:
                System.out.println("желтый");
                break;
            case 4:
                System.out.println("зеленый");
                break;
            case 5:
                System.out.println("голубой");
                break;
            case 6:
                System.out.println("синий");
                break;
            case 7:
                System.out.println("фиолетовый");
                break;
            default:
                System.out.println("У радуги всего 7 цветов");

        }
    }

    public static void oddNumbers() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0)
            {System.out.println(i);}
        }
    }

    public static void decrement() {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void amount() {
        int number;
        int summ = 0;
        while (true) {
            System.out.println("Введите любое положительное число:");
            number = scanner.nextInt();
            if (number <= 0)
            {System.out.println("Введенное число должно быть больше нуля. Попробуйте еще раз.");}
            else break;
        }
        for (int i = 0; i < number; i++) {
            summ += i;
            System.out.println(summ);
        }
    }

    public static void fibonacci() {
        int[] arr = new int[11];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int fib : arr
        ) {
            System.out.println(fib);
        }

    }

    public static void percents() {
        float temp;
        float total = 0;
        float percent = 0.07f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада:");
        float sum = scanner.nextFloat();
        System.out.println("Введите срок вклада(в месяцах):");
        int months = scanner.nextInt();
        for (int i = 0; i < months; i++) {
            temp = sum * percent;
            total += temp;
        }
        total += sum;
        System.out.println(total);


    }

    public static void table() {
        for (int i = 1; i < 10; i++) {
            System.out.println();
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j);
                System.out.print(" ");
            }


        }
    }
}