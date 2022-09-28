package remplazar;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 * 
 */
public class Remplazar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "Hola\tMundo Ho";
        
        System.out.println("Original "+s1);
        
        s1 = s1.replaceFirst("\t", " ");
        
        System.out.println("Copia "+s1);


    }
    
}
