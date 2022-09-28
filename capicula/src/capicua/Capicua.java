package capicua;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Capicua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N,inicio,fin;
        String aux;
        boolean capi = true;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        N = leer.nextInt();
        // N = leer.nextLine();
        aux = Integer.toString(N);
        
        inicio =0;
        fin = aux.length() -1;
        
        while((capi) && (inicio < fin)){
            if(aux.charAt(inicio) == aux.charAt(fin)){
                inicio++;
                fin--;
            }else{
                capi = false;
            }
        }
        
        if(capi){
            System.out.println("El numero " +N+ " es capicua");
        }else{
            System.out.println("El numero " +N+ " no es capicua");
        }
        
    }
}
