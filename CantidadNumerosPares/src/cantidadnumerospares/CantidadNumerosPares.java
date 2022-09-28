package cantidadnumerospares;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class CantidadNumerosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cpares=0, cimpares = 0, num;
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("Ingresa un numero -1 para salir");
            num = leer.nextInt();
            
            if( (num % 2) == 0){
                cimpares++;
            }
        
        }while(num != -1);
         cpares--;
         
         System.out.println("La cantidad de numeros pares es: "+cpares);
         System.out.println("La cantidad de numeros impares es: "+cimpares);
    }
    
}
