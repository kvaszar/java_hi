package byeworld2;

public class Stroki {
    public static void main(String[] args) {
        var s = new char[]{'H', 'e', 'l', 'l', 'o'};
        var x = new StringBuilder(new String(s));
        x.append(", World!");
        System.out.println(x);
    }
}
