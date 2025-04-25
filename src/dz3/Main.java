package dz3;


public class Main {
    public static void main() {
        var x = "abcba";
        System.out.println(x + ": " + isPalindrome(x));
        var y = "abc";
        System.out.println(y + ": " + isPalindrome(y));
    }

    private static boolean isPalindrome(String str) {
        var sb = new StringBuilder(str);
        sb.reverse();
        return str.equals(sb.toString());
    }
}
