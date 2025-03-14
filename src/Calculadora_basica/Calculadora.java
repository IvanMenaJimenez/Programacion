package Calculadora_basica;



public class Calculadora<T extends Number, U extends Number> {

    double sumar(T a, U b) {
        double num1 = a.doubleValue() + b.doubleValue();
        return num1;
    }

    double resta(T a, U b) {
        double num1 = a.doubleValue() - b.doubleValue();
        return num1;
    }

    double dividir(T a, U b) {
        
        if (b.doubleValue() != 0) {
        double num1 = a.doubleValue() / b.doubleValue();    
        return num1;
        }else
            return 0;
        
        
    }

    double multiplicar(T a, U b) {
        double num1 = a.doubleValue() * b.doubleValue();
        return num1;
    }

}
