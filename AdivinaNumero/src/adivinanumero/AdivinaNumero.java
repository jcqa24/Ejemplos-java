package adivinanumero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class AdivinaNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,usuario,intentos = 0;
        
        Scanner leer = new Scanner(System.in);
        Random r = new Random();
        int min,max;
        
        min = 1;
        max = 1000;
        
        // (max - min) + min
        num = r.nextInt(max - min) +min;
        
        do{
            System.out.println("Ingresa un numero entre "+min+" y "+max);
            usuario = leer.nextInt();
            if(num > usuario){
                System.out.println("El numero que buscas es mayor");
            }else if(num < usuario){
                System.out.println("El numero que buscas es menor"); 
            }
            intentos++;
        
        }while(num != usuario);
        
        System.out.println("Felicidades adivinaste el numero "+num+ " en "+intentos+" intentos");
    }
    
}
