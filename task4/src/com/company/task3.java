package com.company;
import java.util.Scanner;

public class task3 {
// Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.
    public static void main(String[] args) {
        System.out.println("Введите число в следующем ввиде 'nnn.ddd' ");
        String str;
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        String[] numb = str.split("\\."); // разбиение строки
        String swap = numb[1];
        numb[1] = numb[0];
        numb[0] = swap;
        System.out.println(numb[0] +  "." + numb[1]);
    }
}
