package ecuacionesgrado1;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class EcuacionesGrado1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ax+b = 0
        // ax = -b -> x = -b/a
        
        int a,b,res;
        double x;
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("ax + b = 0");
            System.out.println("Ingresa el valor de a");
            a = leer.nextInt();
            System.out.println("Ingresa el valor de b");
            b = leer.nextInt();
            
            if (a == 0){
                System.out.println("El valor de a no pueder ser 0");
            }else{
                x = (-1.0*b) / a;
                System.out.println(a+"x + "+b+" = 0");
                System.out.println("\t x -> "+x);
            }
            
            System.out.println("Quieres iniciar de nuevo");
            System.out.println("1 - Si");
            System.out.println("2 - No");
            System.out.println("Ingresa una opcion");
            res = leer.nextInt();
            System.out.println("\n\n");
        
        }while(res != 2);
        
    }
    
}
