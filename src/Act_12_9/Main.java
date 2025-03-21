package Act_12_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList();

        Scanner sc = new Scanner(System.in);

        int num = 0;
        
        do {

            num = sc.nextInt();
            if (num > 0) {
              l.add(num);   
            }
           

        } while (num != -1);

        
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) % 2 == 0) {
                System.out.println(i);
                l.set(i, l.get(i) * 100);
            }
        }
        
        System.out.println(l);
    }

}
