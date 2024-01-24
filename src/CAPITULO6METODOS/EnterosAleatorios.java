package CAPITULO6METODOS;

import java.security.SecureRandom;

public class EnterosAleatorios {
    public static void main( String [ ] args){
        //El objeto numerosAleatorios producirá números aleatorios seguros
        SecureRandom numerosAleatorios = new SecureRandom();

        // itera 20 veces

        for ( int contador = 1; contador <= 20; contador++){

            // elige entero aleatorio del 1 al 6
            int cara = 1 + numerosAleatorios.nextInt(6);

            System.out.printf("%d ", cara ); //muestra el valor generado

            // si contador es divisible entre 5 , empieza una nueva linea de salida.
            if(contador % 3 ==0)
                System.out.println();
        }
    }
}
