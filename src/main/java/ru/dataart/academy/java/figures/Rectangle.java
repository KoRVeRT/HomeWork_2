package ru.dataart.academy.java.figures;

public class Rectangle extends Figure {
    double length;
    double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double perimeter() {
        return 2 * (length + height);
    }

    @Override
    public double area() {
        return length * height;
    }
}
