package Act12_12;

import java.util.HashSet;
import java.util.Set;

public class Main {

    static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2) {

        Set<E> conjunto3 = new HashSet<>();
        conjunto3.addAll(conjunto1);
        conjunto3.addAll(conjunto2);
        return conjunto3;

    }

    static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> conjunto3 = new HashSet<>(conjunto1);
        conjunto3.retainAll(conjunto2);

        return conjunto3;
    }

    public static void main(String[] args) {

        Set<Integer> conjunto = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();

        conjunto.add(2);
        conjunto.add(3);
        conjunto2.add(3);
        System.out.println(interseccion(conjunto, conjunto2));
    }
}
