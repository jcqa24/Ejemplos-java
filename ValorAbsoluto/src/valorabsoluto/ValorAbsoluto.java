package valorabsoluto;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class ValorAbsoluto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el numero que quieres calcular el valor absoluto");
        a = leer.nextInt();     
        
        
        b=a;
        if(a<0){
            b = a *-1;
        }
        
        System.out.println("El valor absuluto de: "+ a+ " es: "+b);
        
    }
    
}
