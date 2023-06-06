package ru.teachmeskills.homework09;

abstract public class Vector {
    private double[] coordinates;

    public Vector(int size) {
        this.coordinates = new double[size];
    }


    public void setCoordinates(double[] coordinates) {
        this.coordinates = coordinates;
    }

    public double[] getCoordinates() {
        return coordinates;
    }

    abstract public double calculateScalar();
    abstract public double calculateSum();
    abstract public double calculateDifference();
    abstract public double calculateLength();




}
