package arrfill;

import java.util.Arrays;


/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class ArrFill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char [] A = new char[10];
        
        Arrays.fill(A, 'a');
        
        Arrays.fill(A,3,7,'b');
        
        for (int i = 0; i < 10; i++) {
              System.out.print(A[i] + " ");
        }
        
    }
    
}
