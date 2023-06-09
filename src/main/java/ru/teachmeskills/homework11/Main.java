package ru.teachmeskills.homework11;

import org.apache.commons.lang3.StringUtils;
import ru.teachmeskills.homework11.task1.Series;

import ru.teachmeskills.homework11.task2.Pass;
import ru.teachmeskills.homework11.task2.WrongLoginException;
import ru.teachmeskills.homework11.task2.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
//Задание 1
        String numberOfDocument = "2331-QqI-5529-MhG-1u6L";
        Series series = new Series();
        try {
            series.checkSequencetoStart(numberOfDocument);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }


        try {
            series.checkSequencetoFinish(numberOfDocument);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        try {
            series.checkNumber("");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }


        //Задание 2
        try {
            System.out.println(Pass.getAuthorization("Ivanov", "qwerty", "qwerty"));
        } catch (WrongLoginException | WrongPasswordException passwords) {
            System.out.println(passwords.getMessage());
        }

    }


}


