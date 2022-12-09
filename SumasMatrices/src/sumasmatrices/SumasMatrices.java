package sumasmatrices;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class SumasMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[][] = {{1,2,3,4,5},
                     {1,2,3,4,5},
                     {1,2,3,4,5},
                     {1,2,3,4,5},
                     {1,2,3,4,5}};
        
        int filas = A.length;
        int columnas = A[0].length;
        
        int suma=0;
        
        // Filas 
        /**
        for (int i = 0; i < filas; i++) {
            suma = 0;
            for (int j = 0; j < columnas; j++) {
                suma += A[i][j];
            }
            System.out.println("La suma de la fila "+i+" es :"+suma);
        }
        
        // Columas
        for (int i = 0; i < columnas; i++) {
            suma = 0;
            for (int j = 0; j < filas; j++) {
                suma += A[j][i];
            }
            System.out.println("La suma de la columna "+i+" es :"+suma);
        }
        
        //Diagonal principal
        suma = 0;
        
        for (int i = 0; i < filas; i++) {
           
            for (int j = 0; j < columnas; j++) {
                if(i==j){
                    suma += A[i][j];
                }
            }
            
        }
        System.out.println("La suma de la diagonal  es :"+suma);
        */
        //Diagonal invertida
        suma = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if((i+j == columnas-1)){
                    suma += A[i][j];
                }
            }
            
        }
        System.out.println("La suma de la diagonal inversa es :"+suma);
    }
    
}
