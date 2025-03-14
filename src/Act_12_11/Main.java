package Act_12_11;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer[] lista = new Integer[0];
        Contenedor c = new Contenedor(lista);

        for (int i = 0; i < 30; i++) {
            lista = Arrays.copyOf(lista, lista.length + 1);
            c.insertarAlPrincipio((int) (Math.random() * 100));
        }
        c.ordenar();
        System.out.println(c.toString());
    }

}
