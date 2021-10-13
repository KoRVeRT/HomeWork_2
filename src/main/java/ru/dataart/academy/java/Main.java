package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task for Java OOP");
        Calculator calculator = new Calculator();
        Figure[] figures = {new Circle(2), new Rectangle(2, 3),
                new Circle(7), new Rectangle(5, 9)};
        System.out.println(calculator.sumArea(figures));
    }
}