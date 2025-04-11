package heloworld1;

public class Main {
    public static void main() {
        var mas = new int[15][];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = new int[i + 1];
        }

        mas[0][0] = 1;
        for (int i = 1; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (j > 0 && j < mas[i].length - 1) {
                    mas[i][j] = mas[i - 1][j - 1] + mas[i - 1][j];
                } else {
                    mas[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("%5d", mas[i][j]);
            }
            System.out.println();
        }
    }
}