package Generics;


public class Main {
    public static void main(String[] args) {

    }
}

class  Point<T extends Number> {
    public T x, y;
    public <V extends Number> boolean median(Point<V> p) {
            return this == p;
    }
}