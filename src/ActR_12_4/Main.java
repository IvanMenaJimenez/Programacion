package ActR_12_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        Collection<Integer> a = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        do {
            num = sc.nextInt();
            if (num >= 1) {
                a.add(num);
            }
        } while (num >= 0);

        for (Integer integer : a) {
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        }

        a.removeIf(n -> n % 3 == 0);

        System.out.println(a.toString());
        
        for (Iterator<Integer> iterator = a.iterator(); iterator.hasNext(); ) {
            Integer next = iterator.next();
            if (next == 2) {
               iterator.remove();
            }
        }
    }
}
