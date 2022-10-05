
package eliminarepetidos;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class EliminaRepetidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] A = {1,1,2,3,4,5,2};
        int [] B = new int[A.length];
        
        int j,top = 0;
        boolean repetido;
        
        for (int i = 0; i < A.length; i++) {
            repetido = false;
            j=0;
            while(!repetido && (j<top) ){
                if(A[i] == B[j]){
                    repetido = true;
                }
                j++;
            }
            
            if(!repetido){
                B[top] = A[i];
                top++;
            }
        }
        System.out.print("Arreglo original: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        
        System.out.println("");
        
        System.out.print("Arreglo sin repetido: ");
        for (int i = 0; i < top; i++) {
            System.out.print(B[i] + " ");
        }
        
        
        
    }
    
}
