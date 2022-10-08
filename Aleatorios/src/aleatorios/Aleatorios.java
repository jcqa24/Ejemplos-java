package aleatorios;

import java.util.Random;


/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Aleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        //r.setSeed(10);
        //(max-min)+min
        System.out.println(r.nextGaussian());
        
        
    }
    
}
