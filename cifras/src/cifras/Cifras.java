package cifras;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Cifras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,c=0,a;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el numero");
        
        n = leer.nextInt();
        a = n;
        
        while(n != 0){
            n = n / 10;
            c++;
        }
        
        System.out.println("El numero " + a + " tiene "+c+" cifras");
    }    
}
