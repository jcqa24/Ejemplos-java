package promnumeros;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class PromNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float suma = 0, promedio, n=0;
        int numeros = 0;
        Scanner leer = new Scanner(System.in);
        
        while(n != -1){
            System.out.println("Ingresa un numero o -1 para salir");
            n = leer.nextFloat();
            if ( n != -1){
                suma +=n;
                numeros++;
                System.out.println("Ingresate el numero "+n);
            }
        }
        promedio = suma / numeros;
        System.out.println("Ingresaste "+numeros+" numeros");
        System.out.println("El promedio es: "+promedio);
    }
    
}
