package ArreglosObjetosArrayList;

public class InicArreglo1 {
    public static void main(String[] args){

        final int LONGITUD_ARREGLO = 10; //DECLARA LA CONSTANTE
        int[] arreglo = new int[LONGITUD_ARREGLO];
        // CALCULA EL VALOR PARA CADA ELEMENTO DEL ARREGLO
        System.out.printf("%s%8s%n", "Indice", "Valor");
        for(int contador = 0; contador< arreglo.length; contador ++) {
            arreglo[contador] = 2 + 2 * contador;
            System.out.printf("%5d%8d%n", contador, arreglo[contador]);

            // encavezados
            //imprime el valor de cada elemento del arreglo


        }
        for( int contador = 0; contador<arreglo.length; contador++) {

            System.out.printf("%5d%8d%n", contador, arreglo[contador]);
        }
    }}