package primos;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc, a, b;
        Scanner leer = new Scanner(System.in);

        System.out.println("Numeros primos");
        System.out.println("1- Verifica que un numero sea primo");
        System.out.println("2- Nunmeros primos en un rago");
        System.out.println("3- Salir");
        System.out.println("Ingresa una opcion");

        opc = leer.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Ingresa el numero");
                a = leer.nextInt();
                if (esPrimo(a)) {
                    System.out.println("El numero " + a + " es primo");
                } else {
                    System.out.println("El numero " + a + " no es primo");
                }
                break;
            case 2:
                System.out.println("Ingresa el limite inferior del rango");
                a = leer.nextInt();
                System.out.println("Ingresa el limite superior del rango");
                b = leer.nextInt();

                if ((a < b) && (a>0) && (b>0)) {
                    for (int i = a; i <= b; i++) {
                        if (esPrimo(i)) {
                            System.out.println("El numero " + i + " es primo");
                        }
                    }
                } else {
                    System.out.println("Datos no validos");
                }
                break;
            case 3:
                System.out.println("Adios!!!");
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }

    public static boolean esPrimo(int a) {
        boolean primo = true;
        int count = 2;

        while ((primo) && (count < a)) {
            if ((a % count) == 0) {
                primo = false;
            } else {
                count++;
            }
        }

        return primo;
    }

}
