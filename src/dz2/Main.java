package dz2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String BLUE = "\033[0;34m";    // BLUE

    public static void main(String[] args) {
        var arr = new ArrayList<>(List.of(1, 2, 3));
        var sc = new Scanner(System.in);
        System.out.println("""
                1. Вывести массив
                2. Ввести новые данные
                3. Найти элемент
                4. Сортировка
                5. Выход
                Введите число:
                """);
        while (sc.hasNextInt()) {
            switch (sc.nextInt()) {
                case 1:
                    System.out.println(BLUE + "1. Вывести массив" + RESET);
                    print_array(arr);
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println(BLUE + "2. Ввести новые данные" + RESET);
                    System.out.println("Введите данные через пробел: ");
                    sc.nextLine();
                    var line = sc.nextLine();
                    arr = Arrays.stream(line.split(" "))
                            .filter(s -> !s.isEmpty())
                            .map(Integer::parseInt)
                            .collect(Collectors.toCollection(ArrayList::new));
                    break;
                case 3:
                    System.out.println(BLUE + "3. Найти элемент" + RESET);
                    System.out.println("Введите число для поиска: ");
                    var num = sc.nextInt();
                    var numPos = arr.indexOf(num);
                    if (numPos != -1) {
                        print_array(arr);
                        System.out.print(" ");
                        for (int i = 0; i < numPos; i++) {
                            System.out.print("   ");
                        }
                        System.out.println(BLUE + "^" + RESET);
                    }
                    sc.nextLine();
                    break;
                case 4:
                    System.out.println(BLUE + "4. Сортировка" + RESET);
                    arr.sort(Integer::compareTo);
                    System.out.println("Отсортировано");
                    sc.nextLine();
                    break;
                case 5:
                    return;
                default:
                    break;
            }
            sc.nextLine();
            System.out.println("""
                    1. Вывести массив
                    2. Ввести новые данные
                    3. Найти элемент
                    4. Сортировка
                    5. Выход
                    Введите число:
                    """);
        }
    }

    private static void print_array(ArrayList<Integer> arr) {
        System.out.print("[");
        for (var x : arr) {
            if (!x.equals(arr.getLast())) {
                System.out.printf("%-3d", x);
            }
        }
        System.out.println(arr.getLast() + "]");
    }
}
