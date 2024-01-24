package IntruccionesWhile;

public class SumaEnterosPares{

    public static void main(String[] args){
        int suma = 0;

        for(int numero= 2; numero <=20; numero +=2){
            System.out.println("El número es: " + numero);
            suma += numero;
            if(numero ==20){
                System.out.println("La suma de enteros de 2 al 20 es igual a : " + suma);
            }
        }

    }
}
