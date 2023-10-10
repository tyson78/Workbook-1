package com.pluralsight;

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

    }
}
