package posnegaarr;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class PosnegaArr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] A = {1,-1,2,-2,3,-3,0,0,0,-8};
       int n=0, p=0,c=0;
       
        for (int i = 0; i < A.length; i++) {
            if(A[i] > 0){
                p++;
            }else if(A[i] < 0){
                n++;
            }else{
                c++;
            }
        }
        
        
        System.out.println("La cantidad de numeros negativos es: "+n);
        System.out.println("La cantidad de numeros positivos es: "+p);
         System.out.println("La cantidad de numeros cero es: "+c);
    }
    
}
