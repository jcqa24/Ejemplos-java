package promedios;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Promedios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menor, num, res;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa numero");
        menor = leer.nextInt();
        System.out.println("Quieres ingresar otro numero 1-Si  2-No");
        res = leer.nextInt();

        while (res != 2) {
            System.out.println("Ingresa numero");
            num = leer.nextInt();
            if(num > menor){
                menor = num;
            }
            System.out.println("Quieres ingresar otro numero 1-Si  2-No");
            res = leer.nextInt();
        }
        
        System.out.println("El numero mayor es: "+menor);

    }

}
