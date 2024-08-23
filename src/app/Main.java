package src.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter circle's radius: ");
        double radius = scanner.nextDouble();
        Area circle = new Circle(radius);

        System.out.print("Enter triangle's base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter triangle's height: ");
        double height = scanner.nextDouble();
        Area triangle = new Triangle(base, height);

        System.out.print("Enter square's side: ");
        double side = scanner.nextDouble();
        Area square = new Square(side);

        System.out.println("Area of Circle is: " + circle.getArea());
        System.out.println("Area of Triangle is: " + triangle.getArea());
        System.out.println("Area of Square is: " + square.getArea());
        System.out.printf("Total area of all figures is: %.2f",
                TotalAreaFigures.getTotalArea(circle, triangle, square)
        );

    }

}
