package ArreglosObjetosArrayList.PasoArreglo;

import com.sun.security.jgss.GSSUtil;

public class PasoArreglo {
    // main crea el arreglo y llama a modificarArreglo y a modificar Elemento
    public static void main(String[] args)
    {
        int[] arreglo = {1,2,3,4,5};

        System.out.println(
                "Efectos de pasar una referencia a un arreglo completo:%n "+
                        "Los valores del arreglo original son:%n");

        //imprime los elementos originales del arreglo

        for(int valor: arreglo)
            System.out.printf(" %d ", valor );

        modificarArreglo(arreglo);
        System.out.println("%n%nLos valores del arreglo modificado son:%n");
        //imprime los elementso modificados del arreglo

        for(int valor: arreglo)
            System.out.printf("%d   ", valor    );
        System.out.printf(
                "%n%nEfextos de pasar el valor de un elemento del arreglo: %n" +
                "arreglo[3] antes de modificarElemnto: %d%n", arreglo[3]);

        modificarElemento(arreglo[3]); // intento por modificar arreglo
        System.out.printf(
                "arreglo[3] despues de modificarElemento: %d%n", arreglo[3] );
    }

    // multiplica cada elemento de un arreglo por 2

    public static void modificarArreglo(int[] arreglo2){

        for(int contador = 0; contador< arreglo2.length; contador++)
            arreglo2[contador]*=2;

    }


    //multiplica el argumento por 2
    public static void modificarElemento(int elemento){
        elemento *=2;
        System.out.printf("Valor del elemento en modificarElemento: %d%n    ", elemento);

    }
}// fin de la clase PasoArreglo

