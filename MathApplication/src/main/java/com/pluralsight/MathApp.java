package com.pluralsight;

import java.util.Scanner;

public class MathApp {

    public static void main(String[] args) {

        /*
        double pricePerPound = 1.5;
        int poundOfPotatoes = 10;
        // double price = pricePerPound * poundOfPotatoes;
        double price = 5 / 247;
        double price2 = 3. / 5.;

        System.out.println(price);
        System.out.println();
        // formatting syntax ("%#.#")
        System.out.printf("$%8.2f \n", price);
        System.out.printf("%9.3f", price);
        System.out.printf("%8.2e %8.3f", price, price2);

        System.out.println("""
                Hello, I'm TYSON
                    I'm from NYC
                    I love Asian foods
                """);
        */
        double bobSalary = 50000.3200;
        double garySalary = 49000.8348;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is: " + highestSalary);

        double carPrice = 4000.30;
        double truckPrice = 8000.23;
        double smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The smallest of two price is: " + smallestPrice);

        double radius = 7.25;
        double areaOfCircle = (3.14159265359) * Math.pow(radius, 2);
        System.out.println("The area of circle is: " + areaOfCircle);

        int n = 5;
        double sqrtOfVariable = Math.sqrt(5);
        System.out.println("The squart root of variable 5 is: " + sqrtOfVariable);

        // Distance between points (5,10) and (85,50)
        double distance = 0.0;
        distance = Math.sqrt(Math.pow(85. - 5.0, 2.0) + Math.pow(50. - 10., 2.0));
        System.out.println("Distance between two points: " + distance);

        System.out.printf("Distance between two points = %5.2f \n", distance);

        calculateDistanceBetween(85.,5.0,50.,10.);

        int num = 42;
        double pi = Math.PI;
        String name = "Alice";
        char grade = 'A';

        // %d - int, %f - double, %c - char, %s - String, %b - Boolean
        String formatted = String.format("Number: %d, Pi: %f, Name: %s, Grade: %c", num, pi, name, grade);
        System.out.println(formatted);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a floating-point number: ");
        double inputValue = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(inputValue);

        System.out.println("Please enter your name: ");
        String inputString = scanner.nextLine();
        System.out.println(inputString);

        if (inputString.equals("Paul")) {
            System.out.println("Go away, Paul");
        }
        else {
            System.out.println("Hello " + inputString);
        }
        return;
    }

    public static double calculateDistanceBetween(double x2, double x1, double y2, double y1) {
        double distance = 0.0;
        distance = Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0));
        return distance;
    }

    public static double promptAndReturnDouble(String prompt) {
        double value;
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt + " : ");
        value = scanner.nextDouble();
        scanner.nextLine();

        return value;
    }
}
