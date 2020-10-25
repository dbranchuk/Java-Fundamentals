package com.company;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        double a,b,c,z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a ");
        a = scanner.nextDouble();
        System.out.println("Input b ");
        b = scanner.nextDouble();
        System.out.println("Input c ");
        c = scanner.nextDouble();
        z = (b + Math.sqrt(Math.pow(b,2) + 4 * a * c)) / (2 * a) - Math.pow(a,3) * c + Math.pow(b,-2);
        System.out.printf("Result: %.2f", z);
    }
}
