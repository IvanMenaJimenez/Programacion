package ActR_12_2;
import java.util.Arrays;
 
public class Contenedor<T extends Comparable<T>> {
    public T[] objetos;
    public Contenedor(T[] objetos) {
        this.objetos = objetos;
    }
    void insertarAlPrincipio(T nuevo) {
        objetos = Arrays.copyOf(objetos, objetos.length + 1);
        System.arraycopy(objetos, 0, objetos, 1, objetos.length - 1);
        objetos[0] = nuevo;
    }
    void insertarAlFinal(T nuevo) {
        objetos = Arrays.copyOf(objetos, objetos.length + 1);
        objetos[objetos.length - 1] = nuevo;
    }
    T extraerDelPrincipio() {
        T num;
        num = objetos[0];
        objetos = Arrays.copyOfRange(objetos, 1, objetos.length);
        return num;
    }
    T extraerDelFinal() {
        T num;
        num = objetos[objetos.length - 1];
        objetos = Arrays.copyOf(objetos, objetos.length - 1);
        return num;
    }
    void ordenar() {
        Arrays.sort(objetos);
    }
 
    @Override
    public String toString() {
        String array = "";
        for (T objeto : objetos) {
            array += objeto;
            array += " ";
        }
        return "[" + array + "]";
    }
 
}
