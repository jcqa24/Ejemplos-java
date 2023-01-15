package transpuesta;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Transpuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[][] = {{51, 21, 33, 49},
                     {12, 22, 34, 84},
                     {19, 21, 23, 44}};
        
        int filas = A.length;
        int columanas = A[0].length;
        
        int B[][] = new int[A[0].length][A.length];
        
        int i,j;
        
        for(i=0;i<A.length;i++){
            for(j=0;j<A[0].length;j++){
                B[j][i] = A[i][j];
            }
        }
        
        for(i=0;i<B.length;i++){
            for(j=0;j<B[0].length;j++){
                System.out.print(" "+B[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
