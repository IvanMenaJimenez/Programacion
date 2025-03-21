/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Act12_17;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        Pila p = new Pila(c);
        p.apilar(3);
        p.apilar(3);
        p.apilar(4);

        p.desaPila();

        System.out.println(p);
    }

}
