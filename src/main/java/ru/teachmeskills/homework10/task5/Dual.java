package ru.teachmeskills.homework10.task5;

public class Dual {

    public  void showToDouble(String text){
        char temp;
        char[] array=text.toCharArray();
        for (int i = 0; i < array.length; i++) {
            temp=array[i];
            System.out.print(array[i]);
            System.out.print(temp);
        }
    }
}
