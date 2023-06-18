import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numerador, denominador, mcd;

        System.out.println("Ingresa el numerador");
        numerador = leer.nextInt();
        System.out.println("Ingresa el denominador");
        denominador = leer.nextInt();

        mcd = MCD(numerador,denominador);

        numerador = numerador / mcd;
        denominador = denominador /mcd;

        System.out.println("La fraccion simplificada es: "+numerador+"/"+denominador);
    }

    public static int MCD(int a, int b){
        if(b == 0){
            return a;
        }else{
            return MCD(b, a%b);
        }
    }
}