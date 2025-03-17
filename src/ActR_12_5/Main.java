package ActR_12_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        Collection<Integer> c2 = new ArrayList<Integer>();
        
        
        for (int i = 0; i < 21; i++) {
            c.add((int) (Math.random() * 10 + 1));
        }

        for (Iterator<Integer> iterator = c.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();

            if (c2.contains(next) == false) {
                c2.add(next);
            }
        }
        
        System.out.println(c2);
        
        
    }
}
