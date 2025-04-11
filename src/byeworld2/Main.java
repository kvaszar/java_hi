package byeworld2;

import java.util.Arrays;

public class Main {
    public static void main() {
        var a = avg(1, 2, 3, 4, 5);
        for (int x : a) {
            System.out.print(x + "\t");
        }
        System.out.println();

        System.out.println(min(1, 2));
        System.out.println(min(3.1, 3.0));
    }


    public static <T extends Comparable<T>> T min(T a, T b) {
        return (a.compareTo(b) > 0) ? a : b;
    }

    public static int[] avg(int... nums) {
        var avg = (Arrays.stream(nums).sum() / nums.length);
        return Arrays.stream(nums).filter(x -> x > avg).toArray();
    }
}

