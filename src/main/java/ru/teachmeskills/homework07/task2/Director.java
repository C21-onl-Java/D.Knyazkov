package ru.teachmeskills.homework07.task2;


public class Director implements Printable {
    private String post;

    public Director(String post) {
        this.post = post;
    }



    @Override
    public String toString()
    {    return post;                   }
}

