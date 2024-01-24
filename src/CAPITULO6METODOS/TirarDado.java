package CAPITULO6METODOS;

import java.security.SecureRandom;

public class TirarDado {
    public static void main(String[ ] args){

        // el objeto numerosAleatorios producirá números aleatorios seguros
        SecureRandom  numerosAleatorios = new SecureRandom();

        int frecuencia1 = 0;
        int frecuencia2 = 0;
        int frecuencia3 = 0;
        int frecuencia4 = 0;
        int frecuencia5 = 0;
        int frecuencia6 = 0;

        // sintetiza los resultados de tirar un dado 6,000,000 veces
        for(int tiro = 1; tiro <= 6000000; tiro++){
            int cara = 1 + numerosAleatorios.nextInt(6); //número del 1 al 6
            // usa el valor de cara de  1 a 6 para determinar qué contador incrementar
            switch( cara){
                case 1:
                    ++frecuencia1; // incrementa el contador de 1s
                    break;
                case 2:
                    ++frecuencia2; // incrementa el contendor de 2s
                    break;
                case 3:
                    ++frecuencia3; // incrementa el contendor de 3s
                    break;
                case 4:
                    ++frecuencia4;
                    break;
                case 5:
                    ++frecuencia5;
                    break;
                case 6:
                    ++frecuencia6;
                    break;
                default:
                    System.out.println("No existe registro");


            }
        }
        System.out.println("Cara\tFrecuencia"  ); // encavezados de salida
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
                frecuencia1, frecuencia2, frecuencia3, frecuencia4, frecuencia5,frecuencia6);


    }
}
