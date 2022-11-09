package busquedasecuencial;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class BusquedaSecuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] A = {4,7,2,8,3,0,5,8};
        int i, pos = -1;
        int dato = 8;
        
        // inicio busqueda secuencial
        for (i = 0; i < A.length; i++) {
            if(dato == A[i]){
                pos = i;
                System.out.println("El elemento fue encontrado en la posicion "+(pos+1));
                //break;
            }
        }
         // fin busqueda secuencial
        
        if(pos == -1){
            System.out.println("El elmento no fue encontrado");
        }
        
        
    }
    
}
