package IntruccionesDeSeleccion;
import java.util.Scanner;
public class CalificacionesLetra {
    public static void main(String[] args){

        int total = 0; // suma de calificaciones
        int contadorCalif = 0; //número de calificaciones introducidas
        int aCuenta = 0; //cuenta de calificaciones A
        int bCuenta = 0; // cuenta de calificaciones B
        int cCuenta = 0; // cuenta de calificaciones C
        int dCuenta = 0; // cuenta de calificaciones D
        int fCuenta = 0; // cuenta de calificaciones F

        Scanner entrada = new Scanner(System.in);

        System.out.printf("%s%n%s%n   %s%n   %s%n" ,
                "Introduzca las calificaciones en el rango de 0-100.",
                "Escriba el indicador de fin de archivo para terminar la entrada:",
                "En UNIX/LINUX/MAC OS X escriba <Ctrl> d y oprima Intro",
                "En windows escriba <Ctrl> z y oprima Intro");
        //Itera hasta que el usuario introduzca el indicador de fin de archivo.
        while(entrada.hasNext())
        {
            int calificacion = entrada.nextInt();
            total += calificacion;// suma calificacion al total
            ++contadorCalif; // incrementa el número de calificaciones

            // incrementa el contador de calificación de letra apropiado

            switch(calificacion / 10)
            {
                case 9 : //
                case 10:
                ++aCuenta;
                break;

                case 8:
                ++bCuenta;
                break;

                case 7:
                ++cCuenta;
                break;

                case 6:
                ++dCuenta;
                break;

                default:
                    ++fCuenta;
                    break;


            }//fin de switch
        }//fin de while
        System.out.printf("%nReporte de Calificaciones: %n");

        if(contadorCalif !=0) {
            //calculo el promedio de todas las calificaciones introducidas

            double promedio = (double) total / contadorCalif;

            //muestra resumen de resultados en pantalla
            System.out.printf("El total de las %d calificaciones introducidas es %d%n", contadorCalif, total);
            System.out.printf("El promedio de la clase es  %.2f%n", promedio);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Numero de estudiantes que recibieron cada calificación: ",
                    "A: ", aCuenta,
                    "B: ", bCuenta,
                    "C: ", cCuenta,
                    "D: ", dCuenta,
                    "F: ", fCuenta);
        }//fin de if
        else
            System.out.println("No se introdujeron calificaciones");

        }

    }

