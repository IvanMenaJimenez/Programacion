package Act12_17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Pila {

    Collection<Integer> c = new ArrayList<>();

    public Pila(Collection c) {
        this.c = c;
    }

    public void apilar(Integer o) {
        c.add(o);
    }

    public Integer desaPila() {
        int num = 0;

        if (!c.isEmpty()) {

            for (Iterator<Integer> iterator = c.iterator(); iterator.hasNext();) {
                Integer next = iterator.next();

                if (iterator.hasNext() == false) {

                    iterator.remove();
                }

            }

        }

        return num;
    }

    @Override
    public String toString() {
        return "Pila{"  + c + '}';
    }

    

}
