package paresimparares;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class ParesImparares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa un numero");
        a = leer.nextInt();
        
        if( a%2 == 0){
            System.out.println("El numero " + a +" es par");
        }else{
            System.out.println("El numero " + a +" es impar");
        }
        
              
    }
    
}
