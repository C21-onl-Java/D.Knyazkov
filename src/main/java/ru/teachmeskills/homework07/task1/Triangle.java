package ru.teachmeskills.homework07.task1;

public class Triangle extends Figure {
    double side1;
    double side2;
    double side3;


    public Triangle(String name,double side1,double side2,double side3) {
        super(name);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;

    }

    @Override
    public double findToPerimeter() {
        return side1+side2+side3;
    }


    @Override
    public double findToSquare() {
        double p=findToPerimeter()/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));


    }
}


