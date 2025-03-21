package Act12_17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Cola {

    Collection<Integer> c = new ArrayList<>();

    public Cola(Collection c) {
        this.c = c;
    }

    public void encolar(Integer o) {
        c.add(o);
    }

    public Integer desencolar() {
        int num = 0;

        if (!c.isEmpty()) {
            num = c.iterator().next();
            c.remove(num);
        }

        return num;
    }

    @Override
    public String toString() {
        return "Cola{" + "c=" + c + '}';
    }

}
