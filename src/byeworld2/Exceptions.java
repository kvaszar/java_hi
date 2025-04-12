package byeworld2;

public class Exceptions {
    public static void main(String[] args) {
        try {
            var x = factorial(5);
            System.out.println(x);
            x = factorial(-1);
            System.out.println(x);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static int factorial(int n) throws NotPositiveException {
        if (n < 1) {
            throw new NotPositiveException("Nuh-uh");
        }
        var fact = 1;
        for (int i = 2; i < n + 1; i++) {
            fact *= i;
        }
        return fact;
    }

    private static class NotPositiveException extends Exception {
        NotPositiveException(String message) {
            super(message);
        }
    }
}

