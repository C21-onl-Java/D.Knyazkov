package ru.teachmeskills.homework04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task04 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите номер задачи:");
        int task = scanner.nextInt();
        switch (task) {
            case 0:findToNumber();
            break;
            case 1:createToArray();
            break;
            case 2:mathToArray();
            break;
            case 3:actionToArray();
            break;
            case 4:findToOddNumber();
            break;
            case 5:
                int[] array={5,3,5,12,4,21,9,6,30};
                System.out.println(Arrays.toString(array));
                for (int i = 1; i < array.length ;i+=2) {
                    array[i]=0;
                }
                System.out.println(Arrays.toString(array));
                break;
            case 6:
                String[] arrays={"Ted","Bob","Steven","Mark","John","Paul"};
                Arrays.sort(arrays);
                System.out.println(Arrays.toString(arrays));
                break;
            case 7:sortToArray();

        }

    }
    public static void findToNumber(){
        Scanner scanner=new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Введите число:");
        int number=scanner.nextInt();
        if (Arrays.binarySearch(array,number)>=0)
        {System.out.println("Введенное число присутствует в массиве");}
        else
            System.out.println("Введенное число отсутствует в массиве");

    }

    public static void createToArray() {
        int count=0;
        Scanner scanner = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        if (Arrays.binarySearch(array, number) < 0) {
            System.out.println("Введенное число отсутствует в массиве");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == number) {
                    count++;
                }
            }
            int[] newArray = new int[array.length-count];
            for (int i = 0,j=0; i < array.length;i++) {
                if (array[i] != number)
                { newArray[j]=array[i];
                    j++;}
            }
            System.out.println(Arrays.toString(newArray));
        }
    }

    public static void mathToArray(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size= scanner.nextInt();
        int[] array=new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i]= (int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(array));
        int max=array[0];
        int min=array[0];
        int avg=0;
        for (int i = 0; i < array.length; i++) {
            avg+=array[i];
            if (array[i]<min)
                min=array[i];

            else if  (array[i]>max)
                max=array[i];

        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(avg/size);
    }

    public static void actionToArray(){
        int[] array1={1,2,3,4,5};
        int[] array2={6,7,8,9,10};
        int avg1=0;
        int avg2=0;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < array1.length ; i++) {
            avg1+=array1[i];
            avg2+=array2[i];
        }
        avg1=avg1/array1.length;
        avg2=avg2/array2.length;
        if (avg1>avg2)
        {
            System.out.println("Массив 1 больше массива 2");
        } else if (avg2>avg1) {
            System.out.println("Массив 2 больше массива 1");
        }
        else
            System.out.println("Масивы равны");
    }

    public static void findToOddNumber(){
        int size;
        int count=0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 6 до 10:");
        while (true) {
            size = scanner.nextInt();
            if (size <6 || size > 10) {
                System.out.println("Вы ввели число в неверном диапазоне, попробуйте еще раз.");
            } else break;
        }
        int[] array=new int[size];
        for (int i = 0; i < array.length ; i++) {
            array[i]=random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length ; i++) {
            if (array[i]%2==0)
            { count++;}
        }
        int[] secondArray=new int[count];
        for (int i = 0,j=0; i < array.length;i++) {
            if (array[i]%2==0)
            {secondArray[j]=array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(secondArray));
    }
public static void sortToArray(){
    int[] array = {9,24,0,91,15,33,19,63,44};
    for (int j = array.length-1; j>0; j--) {
        for (int i = 0,temp=0; i < j; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
            }
        }
    }
    System.out.println(Arrays.toString(array));
}

}




