package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double inputValue1 =
                requestDoubleInput(scanner);

        double inputValue2 =
                requestDoubleInput(scanner);

        System.out.println("""
                Possible calculations:
                (A)dd
                (S)ubtract
                (M)ultiply
                (D)ivide
                Please select an option:
                """);

        double result;
        boolean done = false;

        while (!done) {
            // charAt(0) means char at index 0
            char option = scanner.next().charAt(0);

            switch (option) {
                case 'A', 'a':
                    result = inputValue1 + inputValue2;
                    System.out.println(inputValue1 + " + " + inputValue2 + " = " + result);
                    done = true;
                    break;
                case 'S', 's':
                    result = inputValue1 - inputValue2;
                    System.out.println(inputValue1 + " - " + inputValue2 + " = " + result);
                    done = true;
                    break;
                case 'M', 'm':
                    result = inputValue1 * inputValue2;
                    System.out.println(inputValue1 + " * " + inputValue2 + " = " + result);
                    done = true;
                    break;
                case 'D', 'd':
                    result = inputValue1 / inputValue2;
                    System.out.println(inputValue1 + " / " + inputValue2 + " = " + result);
                    done = true;
                    break;
                default:
                    System.out.println("I didn't understand that, please select an option again");
            }
        }
    }

    private static double requestDoubleInput(Scanner scanner) {
        double inputValue = 0.0;
        System.out.println("Please enter a floating point number: ");
        inputValue = scanner.nextDouble();
        scanner.nextLine();
        return inputValue;
    }
}
