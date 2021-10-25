package ru.dataart.academy.java.figures;

public class Calculator {
    public static double sumArea(Figure[] figures) {
        double sum = 0;
        for (Figure finger : figures) {
            sum += finger.area();
        }
        return sum;
    }
}