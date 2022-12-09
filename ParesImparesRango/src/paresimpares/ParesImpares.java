package paresimpares;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class ParesImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, pares=0, impares=0;
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("Ingresa un numero o -1 para salir");
            n = leer.nextInt();
            if(n != -1){
                if((n%2) == 1){
                    pares++;
                }/*else{
                    impares++;
                }*/
            }
        }while(n != -1);
        
        System.out.println("La cantidad de numeros pares es: "+pares);
        //System.out.println("La cantidad de numeros impares es: "+impares);
    }
    
}
