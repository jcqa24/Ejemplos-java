package multiplicacionmatrices;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class MultiplicacionMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A [][] = {{2,5,4},
                      {1,4,1},
                      {7,8,1}};
        
        int B [][] = {{9,5,1},
                      {7,1,7},
                      };
                
        // Filas -> X.length
        // Columnas -> X[0].length
        int i,j,k;
        int C [][] = new int[A.length][B[0].length];
        
        if(A[0].length != B.length){
            System.out.println("Las matrices no se pueden multiplicar");
        }else{
            for(i=0; i< A.length;i++){
                for(j=0; j<B[0].length;j++){
                    for(k=0;k<A[0].length;k++){
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
        
        
        for ( i = 0; i < C.length; i++) {
            for ( j = 0; j < C[0].length; j++) {
                System.out.print(" "+C[i][j]+" ");
            }
            System.out.println("");
        }
        }
        
        
    }
    
}
