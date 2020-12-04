package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Whats your favorite number?");
            String favoriteNumber = input.nextLine();

            System.out.println("Your favorite number is "+ favoriteNumber);
    }
}
