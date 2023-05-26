package ru.teachmeskills.homework10.task2;

public class Sentences {
    public void showToShottestWord() {
        String s = "Cat,Dog,Apple,Elephant,Bird";
        String[] array = s.split(",");
        String temp;
        for (int j = array.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i].length() < array[i + 1].length()) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println(array[array.length - 1]);

    }
    public void showToLongestWord() {
        String s = "Cat,Dog,Apple,Elephant,Bird,Building";
        String[] array = s.split(",");
        String temp;
        for (int j = array.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i].length() > array[i + 1].length()) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println(array[array.length - 1]);

    }




}