package nocifras;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class NoCifras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int  a;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero entre 0 y 99999");
        a = leer.nextInt();
        
        if( a < 0 || a > 99999){
            System.out.println("El numero esta fuera de rango");
        }else if( a <10){
            System.out.println("El numero tiene 1 cifra");
        }else if(a < 100){
            System.out.println("El numero tiene 2 cifras");
        }else if(a < 1000){
            System.out.println("El numero tiene 3 cifras");
        }else if(a < 10000){
            System.out.println("El numero tiene 4 cifras");
        }else{
            System.out.println("El numero tiene 5 cifras");
        }
    }
    
}
