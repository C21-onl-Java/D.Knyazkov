package ru.teachmeskills.homework07.task1;

public class Circle extends Figure {

    double radius;

    public Circle(String name,double radius) {
        super(name);
        this.radius=radius;
    }

    @Override
    public double findToPerimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    public double findToSquare() {
        return Math.PI*Math.pow(radius,2);
    }
}


