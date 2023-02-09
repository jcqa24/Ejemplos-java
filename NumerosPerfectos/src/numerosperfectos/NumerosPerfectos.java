package numerosperfectos;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class NumerosPerfectos {

    /**
     * @param args the command line arguments
     */
    
    public static boolean esPerfecto(int n){
        int i, suma =1;
        
        for(i=2;i<n;i++){
            if(n%i == 0){
                suma += i;
            }
        }
        
        if(suma == n){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
       // 6 = 1+2+3 = 6
       // 28 = 1+2+4+7+14 = 28
      /* int num;
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        num = leer.nextInt();*/
      
      for(int i = 1; i<=1000;i++){
        if(esPerfecto(i)){
            System.out.println("El numero "+i+" es perfecto");
        }
      }
        
    }
    
}
