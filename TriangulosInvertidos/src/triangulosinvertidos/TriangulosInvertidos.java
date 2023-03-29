package triangulosinvertidos;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class TriangulosInvertidos {

    /**
     * @param args the command line arguments
     */
    
    public static void izq(int filas){
        int i, j;
        
        for(i=filas;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
    }
    
    
    public static void der(int filas){
        int i,j,k;
        
        for(i=filas;i>=1;i--){
            for(k=1;k<=filas-i;k++){
                System.out.print(" ");
            }
            
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            
            System.out.println("");
            
        }
        
    }
    
    
    
    public static void main(String[] args) {
        izq(5);
        der(5);
    }
    
}
