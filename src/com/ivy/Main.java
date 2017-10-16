package com.ivy;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.##");

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Product price: ");
        double price = input.nextDouble();

        System.out.println("Insert cash: ");
        double cash = input.nextDouble();

        cashReturn(cash, price);
    }

    static int[] cashReturn(double insertedCash, double priceOfItem) {
        int[] changeToReturn = new int[]{-1, -1, -1, -1, -1};

        if (priceOfItem < 0.1) {
            System.out.println("Please insert valid price.");
            return changeToReturn;
        }

        if (insertedCash < priceOfItem) {
            System.out.println("Insufficient funds.");
            return changeToReturn;
        }

        double fullChange = insertedCash - priceOfItem;
        System.out.println("Your fullChange is " + Double.parseDouble(DECIMAL_FORMAT.format(fullChange)));

        int dollars = (int) Math.floor(fullChange);
        int decimalChange = (int) (fullChange * 100 - dollars * 100);
        int quarters = decimalChange / 25;
        decimalChange = decimalChange % 25;
        int dimes = (decimalChange / 10);
        decimalChange = decimalChange % 10;
        int nickles = (decimalChange / 5);
        int cents = decimalChange % 5;

        System.out.println("Cashback: " + dollars + " dollars " + quarters + " quarters " + dimes + " dimes " + nickles + " nickles " + cents + " cents");

        changeToReturn[0] = dollars;
        changeToReturn[1] = quarters;
        changeToReturn[2] = dimes;
        changeToReturn[3] = nickles;
        changeToReturn[4] = cents;

        return changeToReturn;
    }
}