package byeworld2;

import java.util.Scanner;

public class Stroki {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var line = sc.nextLine();
        System.out.println(reverse(line));
    }

    private static String reverse(String str) {
        var res = new StringBuilder(str);
        return res.reverse().toString();
    }
}
