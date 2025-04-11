package dz1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число копейков пожалуйста: ");
        var num = new Scanner(System.in).nextInt();
        if (num == 11 || num == 12 || num == 13 || num == 14) {
            System.out.printf("%d копеек", num);
        } else if (num % 10 == 1) {
            System.out.printf("%d копейка", num);
        } else if (num % 10 == 2 || num % 10 == 3 || num % 10 == 4) {
            System.out.printf("%d копейки", num);
        } else {
            System.out.printf("%d копеек", num);
        }
    }
}
