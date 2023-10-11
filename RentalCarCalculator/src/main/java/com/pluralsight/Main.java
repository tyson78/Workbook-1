package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the pickup date: ");
        String date = scanner.nextLine();
        System.out.println(date);

        System.out.println("Please enter number of days for the rental: ");
        int days = scanner.nextInt();
        System.out.println(days);

        System.out.println("Do you want an electronic toll tag at $3.95/day (Y/N): ");
        char tag = scanner.next().charAt(0);
        boolean isTag = false;
        if (tag == 'Y') { isTag = true; }

        System.out.println("Do you want a GPS at $2.95/day (Y/N): ");
        char gps = scanner.next().charAt(0);
        boolean isGPS = false;
        if (gps == 'Y') { isGPS = true; }

        System.out.println("Do you want roadside assistance at $3.95/day (Y/N): ");
        char rSA = scanner.next().charAt(0);
        boolean isrSA = false;
        if (rSA == 'Y') { isrSA = true; }

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        System.out.println(age);

        double result = doCalculation(date, days, tag, isTag, gps, isGPS, rSA, isrSA, age);
        System.out.println("The total cost is: " + result);
    }

    private static double doCalculation (String date, int days, char tag, boolean isTag, char gps, boolean isGPS, char rSA, boolean isrSA, int age) {
        double basicCR = 29.99 * days;
        double subcharge = 0.0;

        double optionsCost = 0.0;
        if (isTag == true) { optionsCost += (double) tag * days;
            System.out.println(optionsCost);}
        if (isGPS == true) { optionsCost += (double) gps * days;
            System.out.println(optionsCost);}
        if (isrSA == true) { optionsCost += (double) rSA * days;
            System.out.println(optionsCost);}

        if (age < 25) { subcharge = (double) 0.30 * basicCR; }

        System.out.println(basicCR);
        System.out.println(optionsCost);
        System.out.println(subcharge);

        double totalCost = basicCR + optionsCost + subcharge;
        return totalCost;
    }
}
