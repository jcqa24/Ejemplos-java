package orden;

import java.util.Arrays;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Orden {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] A = {4,6,2,8,5,0,7,8,3,21};
        
        Arrays.sort(A,3,7);
        
        System.out.println("Arreglo Ordenado");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
            
        }
    }
    
}
