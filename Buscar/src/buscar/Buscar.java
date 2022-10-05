
package buscar;

import java.util.Arrays;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Buscar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] A  = {1,4,6,2,78,32,87,9};
        /// 1,2,4,6
        Arrays.sort(A);
        
        
        if(Arrays.binarySearch(A, 1000) >= 0){
            System.out.println("El elemento esta en el arreglo");
        }else{
            System.out.println("El elemento no esta en el arreglo");
        }
    }
    
}
