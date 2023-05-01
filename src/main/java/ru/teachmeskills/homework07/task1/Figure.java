package ru.teachmeskills.homework07.task1;

public abstract class Figure {
    private String name;

    public Figure(String name) {
        this.name=name;
    }

    public abstract double findToPerimeter();
    public abstract double findToSquare();

}