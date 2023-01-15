package maximocomundivisor;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class MaximoComunDivisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a,b;
        System.out.println("Ingresa el primer numero");
        a = leer.nextInt();
        System.out.println("Ingresa el segundo numero");
        b = leer.nextInt();
        
        System.out.println("El MCD es: "+mcdRec(a,b));
    }
    
    
    public static int MCD(int a, int b){
        int aux;
        
        while(b != 0){
            aux = b;
            b = a % aux;
            a = aux;
        }
        
        return a;
    }
    
   public static int mcdRec(int a, int b) {
  if (b == 0) return a; // Condicion de parada
  return mcdRec(b, a%b);   // Llamada recursiva
}
}
