/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActR_12_6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Main {

    public static void main(String[] args) {

        Collection<Integer> c = new ArrayList<Integer>();

        for (int i = 0; i < 101; i++) {
            c.add((int) (Math.random() * 10 + 1));
        }

        for (Iterator<Integer> iterator = c.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();
            if (next == 5) {
                iterator.remove();
            }
        }
        System.out.println(c);
    }
}
