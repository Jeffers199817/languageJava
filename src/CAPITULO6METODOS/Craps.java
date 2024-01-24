package CAPITULO6METODOS;

import java.security.SecureRandom;

public class Craps {
    //crea un generador de números aleatorios seguros para usarlo en el método tirarDado
    private static final SecureRandom numerosAleatorios = new SecureRandom();

    //enumeración con constantes que representan el estado del juego
    private enum Estado {CONTINUA, GANO, PERDIO}

    ;
// constantes que representan tiros comunes del dado.

    private static final int DOS_UNOS = 2;
    private static final int TRES = 3;
    private static final int SIETE = 7;
    private static final int ONCE = 11;
    private static final int DOCE = 12;


    // ejecuta un juego de craps
    public static void main(String[] args) {
        int miPunto = 0; // punto si no gana o pierde en el primer tiro
        Estado estadoJuego; // puede contener   CONTINUA, GANO O PERDIO
        int sumaDeDados = tirarDados(); // primer tiro de los dados.

        //determina el estado del juego y el punto con base en el primer tiro
        switch (sumaDeDados) {
            case SIETE: //gana con 7 en el primer tiro
            case ONCE: // GANA con 11 en el primer tiro
                estadoJuego = Estado.GANO;
                break;

            case DOS_UNOS: //PIERDE CON 2 1  en el primer tiro
            case TRES: // GpIERDE CON 3con 11 en el primer tiro
            case DOCE:// PIERDE CON 12 EN EL PRIMER TIRO
                estadoJuego = Estado.PERDIO;
                break;
            default: // no ganó ni perdió, por lo que guarda el punto
                estadoJuego = Estado.CONTINUA;
                miPunto = sumaDeDados;// guarda el punto
                System.out.printf("El punto es %d%n", miPunto);
                break;

        }
        // MIENTRAS EL JUEGO NO ESTÉ TERMINADO
        while (estadoJuego == Estado.CONTINUA) //NO GANO NI PERDIO
        {
            sumaDeDados = tirarDados(); // tira los dados de nuevo
            // determina el estado del juego
            if (sumaDeDados == miPunto)// gana haciendo un punto
                estadoJuego = Estado.GANO;
            else if (sumaDeDados == SIETE)// pierde al tirar 7 antes del punto
                estadoJuego = Estado.PERDIO;
        }
        //muestra mensaje de que ganó o perdió
        if (estadoJuego == Estado.GANO)
            System.out.println("El jugador gana");
        else
            System.out.println("El jugador pierde");
    }
    //tira los dados, calcula la suma y muestra los resultado
    public static  int tirarDados()
    {
        //elige valores aleatorios para los dados

        int dado1 = 1 + numerosAleatorios.nextInt(6);
        int dado2 = 1 + numerosAleatorios.nextInt(6);

        int suma = dado1 + dado2; // suma de los valores de los dados.

        //muestra los resultados de estre tiro
        System.out.printf("El jugador tiro %d + %d = %d%n ",dado1,dado2,suma);
        return suma;


    }
}// fin de la clase Craps