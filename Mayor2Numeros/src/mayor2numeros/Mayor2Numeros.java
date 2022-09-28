package mayor2numeros;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Mayor2Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int a,b;
         Scanner leer = new Scanner(System.in);
         
         System.out.println("Ingresa el primer numero");
         a = leer.nextInt();
         System.out.println("Ingresa el segundo numero");
         b = leer.nextInt();
         
         if( a > b){
             System.out.println("El numero mayor es: "+a);
         }else if( b > a){
             System.out.println("El numero mayor es: "+b);
         }else{
             System.out.println("Los numeros son iguales");
         }
    }
    
}
