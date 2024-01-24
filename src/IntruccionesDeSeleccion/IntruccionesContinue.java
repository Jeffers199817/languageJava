package IntruccionesDeSeleccion;

public class IntruccionesContinue {
    // Instrucción continue para terminar una iteración de una instrucción for.
    public static void main( String [] args){
        int cuenta;
        for(  cuenta = 1; cuenta<= 10; cuenta++)// itera 10 veces
        {
            if(cuenta == 5 )
                continue;
            System.out.printf("%d%n", cuenta);


        }
        System.out.println("%nSe uso continue para omitir imprimir 5%n" + cuenta);

    } // fin de main
}// fin de la clase Instrucciones continue

