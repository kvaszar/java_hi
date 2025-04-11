package dz1;

import java.util.Scanner;

public class Extra {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Размер поля пожалуста: ");
        var fieldSize = sc.nextInt();
        System.out.println("Размер клеточки пожалуста: ");
        var squareSize = sc.nextInt();

        var isEmptyLine = false;
        for (int k = 0; k < fieldSize; k++) {
            for (int l = 0; l < squareSize; l++) {
                if (isEmptyLine) {
                    print_line(fieldSize, squareSize, ' ', '*');
                } else {
                    print_line(fieldSize, squareSize, '*', ' ');
                }
            }
            isEmptyLine ^= true;
        }
        System.out.println();

    }

    static void print_line(int fieldSize, int squareSize, char symbol, char inverse_symbol) {
        var isEmptyLine = false;
        for (int k = 0; k < fieldSize; k++) {
            for (int l = 0; l < squareSize; l++) {
                if (isEmptyLine) {
                    System.out.print(inverse_symbol);
                } else {
                    System.out.print(symbol);
                }
            }
            isEmptyLine ^= true;
        }
        System.out.println();
    }
}

