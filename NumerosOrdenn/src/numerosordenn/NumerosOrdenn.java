package numerosordenn;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class NumerosOrdenn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero");
        a = leer.nextInt();
        System.out.println("Ingresa el segundo numero");
        b = leer.nextInt();
        System.out.println("Ingresa el tercer numero");
        c = leer.nextInt();
        
        if(a>b && b>c){
            System.out.println(a + " , "+b+" , "+c);
        }else if( a>c && c > b ){
            System.out.println(a + " , "+c+" , "+b);
        }else if( b>a && a>c ){
            System.out.println(b + " , "+a+" , "+c);
        }else if( b>c && c>a){
             System.out.println(b + " , "+c+" , "+a);
        }else if(c>a && a>b){
             System.out.println(c + " , "+a+" , "+b);
        }else if(c>b && b>a){
            System.out.println(c + " , "+b+" , "+a);
        }
    }
    
}
