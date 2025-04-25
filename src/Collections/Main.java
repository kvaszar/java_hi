package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        var arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(5);
        var res = arrayList.stream().reduce((x, y) -> x + y);
        System.out.println(res.get());

        var a = arrayList.toArray();
        for (var elem : a) {
            System.out.print(elem + "\t");
        }
        System.out.println();

        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }
}
