package OoP;

public class Main {
    public static void main(String[] args) {
        var a = new Abobus();
        System.out.println(a.getName());
    }
}

class Abobus {
    private String name;
    public String getName() {
        return name;
    }
    Integer age;

    Abobus()  {
        name = "AMOGUS";
        age = 42;
    }
}
