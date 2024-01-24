package OperadoresLogicos;

public class Operadores {
    public static void main(String[] args){
        // crear tabla de verdadd para el operado &&(AND condicional)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "AND condicional (&&)", "false && false",(false && false),
                "false && true" ,( false && true),
                "true && false",(true && false),
                "true && true", ( true && true));
        // crea tabal de verdad para el operador ||( or condicional)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "OR condicional ( ||)", "false || false", (false || false),
                "false || true ",(false || true),
                "true || false", ( true || false),
                "true || true", ( true || true));

        // crea tabal de verda para el operado & ( AND Lógico booleano)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "AND logico booleano (&)", "false & false",(false & false),
                "false & true", ( false & true),
                "true & false ",( true & false),
                "true & true", ( true & true)   );
         //crea tabal de verdad para el operado | ( OR inclusivo lógico boolenano
        System.out.printf( "%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "OR inclusivo logico booleano(|)",
                "false | false",(false | false),
                "false | true ", ( false | true),
                "true  | false", (true | false),
                "true | true", ( true | true)
                );
        // crea tabla de verdad para el operador or exclusivo lógico boolenano
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "OR exclusivo logico booleano(^)",
                "false ^ true", ( false ^ true),
                "false ^ false", ( false ^ false),
                "true ^ false", ( true ^ false),
                "true ^true ", ( true ^ true));
    }
}
