package ru.teachmeskills.homework07.task1;

public class Circle extends Figure {
    final double PI=3.14;
    double radius;

    public Circle(String name,double radius) {
        super(name);
        this.radius=radius;
    }

    @Override
    public double findToPerimeter() {
        return 2*PI*radius;
    }
    @Override
    public double findToSquare() {
        return PI*Math.pow(radius,2);
    }
}


