import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
         int numerador, denominador, mcd, numerador2,denominador2,mcm,numeradorResultado;

        System.out.println("Ingresa la primer fraccion (numerador/denominador) ");
        numerador = leer.nextInt();
        denominador = leer.nextInt();
        System.out.println("Ingresa la segunda fraccion (numerador/denominador) ");
        numerador2 = leer.nextInt();
        denominador2 = leer.nextInt();


        mcm = MCM(denominador,denominador2);

        numerador = (mcm/denominador) * numerador;
        numerador2 = (mcm/denominador2) * numerador2;

        numeradorResultado = numerador - numerador2;

        mcd = MCD(numeradorResultado,mcm);

        numeradorResultado = numeradorResultado / mcd;
        mcm = mcm /mcd;

        System.out.println("El resultado de la resta es: "+numeradorResultado+"/"+mcm);


    }


    public static int MCD(int a, int b){
        if(b == 0){
            return a;
        }else{
            return MCD(b, a%b);
        }
    }

    public static int MCM(int a, int b){
        return (a*b) / MCD(a,b);

    }

}
