package CAPITULO6METODOS;

public class SobrecargaMetodos {

    // prueba los métodos cuadrado sobrecargados

    public static void main(String[] args){
        System.out.printf("El cuadrado del entero 7 es %d%n", cuadrado(7));
        System.out.printf("El cuadrado del double 7.5 es %f%n", cuadrado(7.5));

    }

    // método cuadrado con argument ino
    public static int cuadrado( int valorInt){
        System.out.printf("%n Se llamo a cuadrad con argumento int:  %d%n", valorInt);
        return valorInt*valorInt;

    }
    public static double cuadrado( double valorDouble){
        System.out.printf("%n Se llamo a cuadrado con argumento Double: %f%n ", valorDouble);
        return valorDouble*valorDouble;
    }
}
