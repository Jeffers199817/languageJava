package ArreglosMultidimensionales;

public class ArreglosBidimensionales {

    public static void main(String[] args) {

        int total = 0;

        int[][] a = {{2, 35, 23, 23, 5, 12}, {3, 4, 5, 2, 3, 23, 63},{3,52,34,2,34,52}};

        for(int fila=0 ; fila<a.length; fila++)
        {


        for (int columna = 0; columna < a[fila].length; columna++)

            total += a[fila][columna];
        }

        System.out.println(" Suma total es: " + total);
    }
}