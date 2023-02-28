package Hash;

import java.util.*;

public class Majorelement {
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 2, 2, 2, 2, 5, 1, 3, 1, 5, 1 };
        HashSet<Integer> major = new HashSet<Integer>();

        HashMap<Integer, Integer> a = new HashMap<>();
        for (int num : numbers) {
            if (a.containsKey(num)) {

                a.put(num, a.get(num) + 1);
                if (a.get(num) >= numbers.length / 3) {

                    major.add(num);
                }
            } else {

                a.put(num, 1);
                int mn = numbers.length / 3;
                if (a.get(num) >= mn) {
                    major.add(num);
                }
            }

        }
        Iterator s;
        s = major.iterator();

        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }
}
