package maximocomundivisorrecursivo;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class MaximoComunDivisorRecursivo {

    /**
     * @param args the command line arguments
     */
    
    
    /**
     while(b != 0){
            aux = b;
            b = a % aux;
            a = aux;
        }
        
        return a;
     
    */
    
    public static int MCDRecursivo(int a, int b){
        if(b == 0){
            return a;
        }else{
            return MCDRecursivo(b,a%b);
        }
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a,b;
        System.out.println("Ingresa el valor de a");
        a = leer.nextInt();
        System.out.println("Ingresa el valor de b");
        b = leer.nextInt();
        
        System.out.println("El MCD de "+a+" y "+b+" es: "+MCDRecursivo(a, b));
    }
    
}
