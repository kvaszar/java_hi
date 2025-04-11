package byeworld2;

import jdk.jshell.JShell;

import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        try (var js = JShell.create()) {
            var sc = new Scanner(System.in);

            while (true) {
                System.out.print("> ");
                System.out.println(js.eval(sc.nextLine()).getFirst().value());
            }
        }
    }
}
