package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.print("Please enter number of tickets: ");
        Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();
        System.out.print("How many round-trip tickets: ");
                int roundtrip = scanner.nextInt();
        Ticket ticket = new Ticket(number, roundtrip);
        ticket.print();
    }
}
