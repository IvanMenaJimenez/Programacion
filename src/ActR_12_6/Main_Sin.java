package ActR_12_6;

import java.util.ArrayList;
import java.util.Collection;

public class Main_Sin {

    public static void main(String[] args) {
        int num;
        Collection<Integer> c = new ArrayList<Integer>();

        for (int i = 0; i < 101; i++) {
            c.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(c);
        
        c.removeIf(n -> n == 5);
        
        System.out.println(c);
     
    }

}
