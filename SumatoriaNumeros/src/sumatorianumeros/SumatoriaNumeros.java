package sumatorianumeros;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class SumatoriaNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, suma=0, c=0;
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("Ingresa un numero o 0 para terminar");
            num = leer.nextInt();
            suma += num;
            c++;
            
        }while(num != 0);
        c--;
        
        System.out.println("El resultado de la suma de los " +c+ " numeros es: "+suma);
        
    }
    
}
