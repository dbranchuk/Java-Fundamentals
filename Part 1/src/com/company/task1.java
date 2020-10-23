package com.company;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        double a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input 'a' ");
        a = scan.nextDouble();
        System.out.println("Input 'b' ");
        b = scan.nextDouble();
        System.out.println("Input 'c' ");
        c = scan.nextDouble();
        double z = ( (a - 3) * b / 2 ) + c;
        System.out.println("Result = " + z);
    }
}
