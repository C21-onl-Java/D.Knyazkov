package ru.teachmeskills.homework07.task1;



public class Box extends Figure {
    double side1;
    double side2;
    public Box(String name,double side1,double side2) {
        super(name);
        this.side1=side1;
        this.side2=side2;
    }

    @Override
    public double findToPerimeter() {
        return 2*(side1+side2);
    }

    @Override
    public double findToSquare() {
        return side1*side2;
    }


}

