package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("What's your name?:");

            String name;
            try {
                name = input.next();

            } catch (Exception ex) {
                name = "Yuri";
            }

            if (name.equals("Yuri")) {
                System.out.println(name + ", fix the sink.");

            } else if (name.equals("Julia")) {
                System.out.println(name + ", wash the dishes.");
            } else {
                System.out.println("Hello, " + name + ", you've no obligations today.");
            }
        }
    }
}
