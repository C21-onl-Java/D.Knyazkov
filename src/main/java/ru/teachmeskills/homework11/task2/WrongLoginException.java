package ru.teachmeskills.homework11.task2;

public class WrongLoginException extends Exception{

    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {
    }
}
