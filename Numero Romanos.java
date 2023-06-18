import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;
        String numeroRomano;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        numero = leer.nextInt();


        if(numero < 1 || numero > 3999 ){
            System.out.println("El numero debe estar entre 1 y 3999");
        }else{
            numeroRomano = convertirARomano(numero);
            System.out.println(numero + " en numeros romanos es: "+numeroRomano);
        }

    }


    public static String convertirARomano(int numero){
        String [] unidades = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String [] decenas = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String [] centenas = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String [] miles = {"","M","MM","MMM"};
        int indexmil, indexcen, indexdec, indexuni;

        indexmil = numero / 1000;
        numero = numero % 1000;
        indexcen = numero / 100;
        numero =  numero % 100;
        indexdec = numero / 10;
        numero = numero % 10;
        indexuni = numero;

        return  miles[indexmil] + centenas[indexcen] + decenas[indexdec] + unidades[indexuni];

    }
}