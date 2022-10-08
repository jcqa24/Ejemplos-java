
package aleatoriosmath;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class AleatoriosMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // (random() * (max - min) )+min
        int n = (int)((Math.random()*(10-5))+5);
        System.out.println(n);
    }
    
}
