package split;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Split {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "Juan,02,04,1995";
        String [] a1 ;
        
        a1 = s1.split(",");
        
        System.out.println("El nombre es: "+a1[0]);
        System.out.println("Dia de nacimiento: "+a1[1]);
        System.out.println("Mes de nacimiento: "+a1[2]);
        System.out.println("Año de nacimiento: "+a1[3]);
    }
    
}
