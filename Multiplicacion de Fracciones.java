import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numerador, denominador, mcd,numerador2, denominador2,numeradorRes, denominadorRes;

        System.out.println("Ingresa la primer fraccion (numerador/denominador)");
        numerador = leer.nextInt();
        denominador = leer.nextInt();

        System.out.println("Ingresa la segunda fraccion (numerador/denominador)");
        numerador2 = leer.nextInt();
        denominador2 = leer.nextInt();

        //Multiplicacion
        //numeradorRes = numerador * numerador2;
        //denominadorRes = denominador * denominador2;

        numeradorRes = numerador * denominador2;
        denominadorRes = denominador* numerador2;


        mcd = MCD(numeradorRes,denominadorRes);

        numeradorRes = numeradorRes / mcd;
        denominadorRes = denominadorRes /mcd;

        System.out.println("El resultado de la multipĺicacion es: "+numeradorRes+"/"+denominadorRes);
    }

    public static int MCD(int a, int b){
        if(b == 0){
            return a;
        }else{
            return MCD(b, a%b);
        }
    }
}