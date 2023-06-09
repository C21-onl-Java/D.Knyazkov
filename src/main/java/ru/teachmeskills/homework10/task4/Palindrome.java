package ru.teachmeskills.homework10.task4;

public class Palindrome {
    public boolean checkPalindromе(String text) {
        StringBuilder builder1 = new StringBuilder(text);
        builder1.reverse();
        String temp = String.valueOf(builder1);
        String result = temp.replaceAll(" ", "");
        String palindrome = text.replaceAll(" ", "");
        return palindrome.equalsIgnoreCase(result);
    }

    public boolean checkToWord(int number) {
        Boolean answer = false;
        String palendrome = "Дед,Москва, шалаш,танец,мадам";
        String[] array = palendrome.split(",");
        try {
            answer = checkPalindromе(array[number]);
        } catch (Exception e) {
            System.out.println("Введено неверное число");
        }
        return answer;
    }
}
