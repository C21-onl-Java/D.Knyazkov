package ru.teachmeskills.homework07.task2;

public class Accountant implements Printable {
    private String post;
    public Accountant(String post) {
        this.post = post;
    }
    @Override
    public String toString()
    {    return String.format("%s",post);                   }

}
