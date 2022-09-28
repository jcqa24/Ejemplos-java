
package unirarrays;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Unirarrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] A = {1,2,3,78,100};
        int [] B = {5,6,7,8,7,45};
        int tam,c=0;
        
        tam = A.length + B.length;
        int [] C = new int[tam];
        
        for (int i = 0; i < A.length; i++) {
            C[c++] = A[i];
        }
        
        for (int i = 0; i < B.length; i++) {
            C[c++] = B[i];
        }
        
        for (int i = 0; i < tam; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println("");
    }
    
}
