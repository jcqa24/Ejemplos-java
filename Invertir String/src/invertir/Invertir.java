package invertir;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Invertir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5,6,7,8,9,10};
        int [] B = new int[A.length];
        int pos = A.length-1;
        
        System.out.print("El arrego original [");
        
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + ",");
        }
        
        System.out.println("]");
        
        for (int i = 0; i < A.length; i++) {
            B[i] = A[pos];
            pos--;
        }
        
         System.out.print("El arrego inverso [");
        
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i]+ ",");
        }
        
        System.out.println("]");
    }
    
}
