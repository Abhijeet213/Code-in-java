package Hash;

import java.util.HashSet;
import java.util.Iterator;

public class Unionofarray {
    public static void main(String[] args) {
        int arr[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        HashSet<Integer> rd = new HashSet<>();
        for (int ints : arr) {
            rd.add(ints);
        }
        for (int ints : arr2) {
            rd.add(ints);
        }
        Iterator aj = rd.iterator();
        while (aj.hasNext()) {
            System.out.println(aj.next());

        }

    }
}
