package ru.teachmeskills.homework09;

public class Vector2D extends Vector{


    public Vector2D(int size) {
        super(2);
    }

    @Override
    public double calculateScalar() {
        return 0;//возвращаем результат формулы по вычислению скалярного произведения
    }

    @Override
    public double calculateSum() {
        return 0;//возвращаем результат формулы по вычислению суммы векторов
    }

    @Override
    public double calculateDifference() {
        return 0;//возвращаем результат формулы по вычислению разности векторов
    }

    @Override
    public double calculateLength() {


        return Math.sqrt(Math.pow(getCoordinates()[2]-getCoordinates()[0],2+Math.pow(getCoordinates()[3]-getCoordinates()[1],2)));
    }


}
