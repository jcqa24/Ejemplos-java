package copia;

import java.util.Arrays;


/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Copia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int [] ori = {1,2,3,4,5,6};
            int [] copy;
            
            copy = Arrays.copyOfRange(ori,2,5);
            
            for (int i = 0; i < copy.length; i++) {
                System.out.println(copy[i]);
            
        }
    }
    
}
