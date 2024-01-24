// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.sql.SQLOutput;
import java.util.Scanner;

public class TestCuenta {


    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("JEFFERSON", "ALQUINGA", 25, "PUEMBO", 50);
        Cuenta cuenta2 = new Cuenta("BERNARO", "ALQUINGA", 35, "PUEMBO", 150);
        Cuenta cuenta3 = new Cuenta("STALIN", "ALQUINGA", 33, "PUEMBO", -50);
        Cuenta cuenta4 = new Cuenta("ALEX", "ALQUINGA", 32, "PUEMBO", 450);
        Cuenta cuenta5 = new Cuenta("TESLA", "ALQUINGA", 23, "PUEMBO", -20);


        System.out.println("NOMBRE: " + cuenta1.getNombre() + "  APELLIDO:" + cuenta1.getApellido() + "  EDAD: " + cuenta1.getEdad() + "  DIRECCIÓN: " + cuenta1.getDirección() + "  SALDO DISPONIBLE: " + cuenta1.consultarSaldo());
        System.out.println("NOMBRE: " + cuenta2.getNombre() + "  APELLIDO:" + cuenta2.getApellido() + "  EDAD: " + cuenta2.getEdad() + "  DIRECCIÓN: " + cuenta2.getDirección() + "  SALDO DISPONIBLE: " + cuenta2.consultarSaldo());
        System.out.println("NOMBRE: " + cuenta3.getNombre() + "  APELLIDO:" + cuenta3.getApellido() + "  EDAD: " + cuenta3.getEdad() + "  DIRECCIÓN: " + cuenta3.getDirección() + "  SALDO DISPONIBLE: " + cuenta3.consultarSaldo());
        System.out.println("NOMBRE: " + cuenta4.getNombre() + "  APELLIDO:" + cuenta4.getApellido() + "  EDAD: " + cuenta4.getEdad() + "  DIRECCIÓN: " + cuenta4.getDirección() + "  SALDO DISPONIBLE: " + cuenta4.consultarSaldo());
        System.out.println("NOMBRE: " + cuenta5.getNombre() + "  APELLIDO:" + cuenta5.getApellido() + "  EDAD: " + cuenta5.getEdad() + "  DIRECCIÓN: " + cuenta5.getDirección() + "  SALDO DISPONIBLE: " + cuenta5.consultarSaldo());

        System.out.println("Elija un opción para el número de Cuenta");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Realizaremos un deposito en Todas las cuentas");
        System.out.println("Cuentas existente, CUENTA1, CUENTA2, CUENTA3, CUENTA4, CUENTA5");
        System.out.println(" ");
        System.out.println("Bienvenido a la CUENTA 1.");
        System.out.println("Ingrese el monto a retira");

        double montoRetirar = entrada.nextDouble();
        cuenta1.retirarSaldo(montoRetirar);
        System.out.println("Su Retiro fue de : " + montoRetirar + " Saldo actual: " + cuenta1.consultarSaldo());
        System.out.println("NOMBRE: " + cuenta1.getNombre() + "  APELLIDO:" + cuenta1.getApellido() + "  EDAD: " + cuenta1.getEdad() + "  DIRECCIÓN: " + cuenta1.getDirección() + "  SALDO DISPONIBLE: " + cuenta1.consultarSaldo());
        System.out.println("Ingrese el monto a Depositar: ");
        double montoDepositar = entrada.nextDouble();
        cuenta1.depositarSaldo(montoDepositar);
        System.out.println("Su deposito fue de : " + montoDepositar + " Saldo actual: " + cuenta1.consultarSaldo());
        System.out.println("NOMBRE: " + cuenta1.getNombre() + "  APELLIDO:" + cuenta1.getApellido() + "  EDAD: " + cuenta1.getEdad() + "  DIRECCIÓN: " + cuenta1.getDirección() + "  SALDO DISPONIBLE: " + cuenta1.consultarSaldo());


        System.out.println("Bienvenido a la CUENTA 2.");
        System.out.println("Ingrese el monto a retira");

        double montoRetirar2 = entrada.nextDouble();
        cuenta2.retirarSaldo(montoRetirar2);
        System.out.println("Su Retiro fue de : " + montoRetirar2 + " Saldo actual: " + cuenta2.consultarSaldo());
        System.out.println("NOMBRE: " + cuenta2.getNombre() + "  APELLIDO:" + cuenta2.getApellido() + "  EDAD: " + cuenta2.getEdad() + "  DIRECCIÓN: " + cuenta2.getDirección() + "  SALDO DISPONIBLE: " + cuenta2.consultarSaldo());
        System.out.println("Ingrese el monto a Depositar: ");
        double montoDepositar2 = entrada.nextDouble();
        cuenta2.depositarSaldo(montoDepositar2);
        System.out.println("Su deposito fue de : " + montoDepositar2 + " Saldo actual: " + cuenta2.consultarSaldo());
        System.out.println("NOMBRE: " + cuenta2.getNombre() + "  APELLIDO:" + cuenta2.getApellido() + "  EDAD: " + cuenta2.getEdad() + "  DIRECCIÓN: " + cuenta2.getDirección() + "  SALDO DISPONIBLE: " + cuenta2.consultarSaldo());


        System.out.println(" ACTUALIZACIÓN DE DATOS DE LA CUENTA.");

        System.out.println("NOMBRE: " + cuenta1.getNombre() + "  APELLIDO:" + cuenta1.getApellido() + "  EDAD: " + cuenta1.getEdad() + "  DIRECCIÓN: " + cuenta1.getDirección() + "  SALDO DISPONIBLE: " + cuenta1.consultarSaldo());
        System.out.println("NOMBRE: " + cuenta2.getNombre() + "  APELLIDO:" + cuenta2.getApellido() + "  EDAD: " + cuenta2.getEdad() + "  DIRECCIÓN: " + cuenta2.getDirección() + "  SALDO DISPONIBLE: " + cuenta2.consultarSaldo());
        System.out.println("NOMBRE: " + cuenta3.getNombre() + "  APELLIDO:" + cuenta3.getApellido() + "  EDAD: " + cuenta3.getEdad() + "  DIRECCIÓN: " + cuenta3.getDirección() + "  SALDO DISPONIBLE: " + cuenta3.consultarSaldo());
        System.out.println("NOMBRE: " + cuenta4.getNombre() + "  APELLIDO:" + cuenta4.getApellido() + "  EDAD: " + cuenta4.getEdad() + "  DIRECCIÓN: " + cuenta4.getDirección() + "  SALDO DISPONIBLE: " + cuenta4.consultarSaldo());
        System.out.println("NOMBRE: " + cuenta5.getNombre() + "  APELLIDO:" + cuenta5.getApellido() + "  EDAD: " + cuenta5.getEdad() + "  DIRECCIÓN: " + cuenta5.getDirección() + "  SALDO DISPONIBLE: " + cuenta5.consultarSaldo());


    }


}


    


