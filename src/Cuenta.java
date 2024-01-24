import com.sun.jdi.event.StepEvent;
import com.sun.security.jgss.GSSUtil;

public class Cuenta {

    private String nombre;
    private String apellido;
    private int edad;
    private String Dirección;

    private double saldo;

    public Cuenta( String nombre,String apellido,int edad, String Dirección,  double saldo ){

        this.nombre = nombre;
        this.apellido= apellido;


        if(edad>0){
            this.edad=edad;
        }
        this.Dirección= Dirección;
        if(saldo>0){
            this.saldo=saldo;
        }
    }

    public void retirarSaldo(double retirarDinero){

        if(saldo ==0){
            System.out.println("No tiene dinero en su cuenta.");
        }
        if(saldo< retirarDinero) {
            System.out.println("No Tiene suficiente Dinero.");
            System.out.println("Su Saldo disponible es: " + saldo);
        }
        saldo = saldo - retirarDinero;
        System.out.println("Su retiro está siendo procesado ........." + "El saldo a retirar es de : " + retirarDinero);
        System.out.println("Retiro exitoso");

    }
    public double consultarSaldo(){

        return saldo;

    }
    public void depositarSaldo( double montoDepositar){

        if(montoDepositar> 0 ){
            saldo = saldo +montoDepositar;


        }

    }
    public void setNombre(String nombre){
          this.nombre=nombre;

    }

    public void setApellido(String Apellido){
        this.apellido=Apellido;

    }

    public void setDirección(String Dirección){
        this.apellido=apellido;

    }
    public void setEdad(int edad){
        this.edad=edad;

    }

    public void setSaldo(double saldo){
        this.saldo = saldo;

    }

    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return  apellido;

    }

    public int getEdad(){
    return edad;
    }

    public String getDirección(){
        return Dirección;

    }
    public double saldo(){
        return  saldo;
    }

}









