package ru.teachmeskills.homework07.task2;

public class Worker implements Printable {
    private String post;

    public Worker(String post) {
        this.post = post;
    }



    @Override
    public String toString()
    {    return String.format("%s",post);                   }
}


