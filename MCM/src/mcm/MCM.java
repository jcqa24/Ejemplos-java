package mcm;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class MCM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int n1,n2,n3,i = 2 , mcm =1;
       
        System.out.println("Ingrese el primer numero");
        n1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = leer.nextInt();
        System.out.println("Ingrese el tercer numero");
        n3 = leer.nextInt();
        
        while(i <= n1 || i <= n2 || i <= n3){
            if( n1 % i == 0 || n2 %i == 0 || n3 %i == 0){
                if(n1 % i == 0){
                    n1 = n1/i;
                }
                if(n2 % i == 0){
                    n2 = n2/i;
                }
                if(n3 % i == 0){
                    n3 = n3/i;
                }
                
                mcm = mcm * i;
            }else{
                i++;
            }
        }
        
        System.out.println("El MCM es: "+mcm);
    }
    
}
