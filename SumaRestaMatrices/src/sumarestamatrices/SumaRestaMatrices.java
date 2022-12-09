package sumarestamatrices;

import java.util.Random;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class SumaRestaMatrices {

    /**
     * @param args the command line arguments
     */
    
    public static void inicializarMatriz(int [][] tem,int filas, int columnas){
        int i,j;
        Random r = new Random();
        for(i=0;i<filas;i++){
            for(j=0;j<columnas;j++){
                tem[i][j] = r.nextInt(10)+1;
            }
        }
        
    }
    
    public static void imprimirMatriz(int [][] tem,int filas, int columnas){
        int i,j;
        for(i=0;i<filas;i++){
            for(j=0;j<columnas;j++){
                System.out.format(" %02d",tem[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void sumar(int [][] A,int [][] B,int [][] C, int filas, int columnas){
        int i,j;
        for(i=0;i<filas;i++){
            for(j=0;j<columnas;j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        
    }
    
    
    public static void main(String[] args) {
        int filas = 3;
        int columnas = 3;
        
        int [][] A = new int[filas][columnas];
        int [][] B = new int[filas][columnas];
        int [][] C = new int[filas][columnas];
        
        inicializarMatriz(A, filas, columnas);
        inicializarMatriz(B, filas, columnas);
        
        System.out.println("------------------\n");
        
        imprimirMatriz(A, filas, columnas);
        
        System.out.println("\n------------------\n");
        
        imprimirMatriz(B, filas, columnas);
        
        sumar(A, B, C, filas, columnas);
        
        System.out.println("\n------------------\n\t\tRESULTADO\n");
        
        imprimirMatriz(C, filas, columnas);
        
        
    }
    
}
