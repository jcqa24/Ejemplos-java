package arreglosinrepetidos;

import java.util.Random;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class ArregloSinRepetidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] A = new int[10];
        int i=0, n;
        Random r = new Random();
        
        
        while(i<10){
            n = r.nextInt(10)+1;
            if(! Busqueda(A,n,i)){
                A[i] = n;
                i++;
            }
            
        }
        
        for (int j = 0; j < A.length; j++) {
            System.out.print(A[j]+" ");
        }
        
    }
    
    public static boolean Busqueda(int [] A,int n, int i){
        int j;
        
        for(j=0;j<i;j++){
            if (n == A[j]){
                return true;
            }
        }
        
        return false;
        
    }
    
}
