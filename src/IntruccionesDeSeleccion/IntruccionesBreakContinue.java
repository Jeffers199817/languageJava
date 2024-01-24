package IntruccionesDeSeleccion;

public class IntruccionesBreakContinue {
    public static void main(String[ ] args){

        int cuenta;// la variable de control también se usa termina el ciclo

        for( cuenta=1 ; cuenta<= 10; cuenta++){ // itera 10 veces
            if( cuenta == 5)
                break;// termian el ciclo si cuenta es 5
            System.out.printf("%d%n", cuenta);


        }
        System.out.println("%nSalio del ciclo en cuenta = 5%n" + cuenta);
    }
}// fin de la clase pruebaBreak.
