package ArreglosObjetosArrayList;

public class SumaArreglo {
    public static void main( String[] args){
        int[] arreglo = { 87,68, 100, 83,78,85,91,76,87};
        int total = 0;

        // suma el valor de cada elemento al total
        for( int contador = 0; contador < arreglo.length; contador++) {

            total += arreglo[contador];

        }
        System.out.printf("Calificación suma total es: %d%n", total);
    }
}

