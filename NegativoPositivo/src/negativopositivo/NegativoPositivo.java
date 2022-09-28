package negativopositivo;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class NegativoPositivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa un numero :");
        a = leer.nextInt();
        
        if( a < 0){
            System.out.println("El numero es negativo");
        }else if(a > 0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero 0 es neutro");
        }
    }
    
}
