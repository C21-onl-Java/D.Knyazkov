package ru.teachmeskills.homework10.task5;

public class Dual {

    public void showToDouble(String text) {
        String[] word = text.split("");
        for (String character : word
        ) {
            System.out.print(character.repeat(2));
        }

    }
}

