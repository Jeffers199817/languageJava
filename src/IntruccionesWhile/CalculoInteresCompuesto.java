package IntruccionesWhile;

public class CalculoInteresCompuesto {

    public static void main( String[ ] args){

        double p = 1000; // monto que se invirtio
        double r = 0.05; // 5 % es la tasa de interés anual
        int n = 0; // número de años
        double a = 0; // es la cantidad depositada al final de n-ésimo ano

        for(n=1; n<=10; n++){

            a= p*Math.pow(1.0+r,n);
            System.out.println("Monto de dinero en la cuenta en el añó : " + n+" es:"+ a);
            if ( n==10){
                System.out.println("Monto de dinero en el n-esimo año es :" + a );
            }
        }
    }
}


