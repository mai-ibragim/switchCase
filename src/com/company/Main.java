package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Gib bitte eine Währung ein: ");
        String währung = scan.nextLine();

        switch (währung) {
            case "USD":
                System.out.println("USD = 84.8");
                break;
            case "EUR":
                System.out.println("EUR = 95.9");
                break;
            case "RUB":
                System.out.println("RUB = 1.14");
                break;
            case "KZT":
                System.out.println("KZT = 0.19");
                break;
            default:
                System.out.println("Leider haben wir keine mehr Währung.");
        }
    }
}
