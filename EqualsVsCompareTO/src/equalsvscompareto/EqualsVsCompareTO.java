package equalsvscompareto;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class EqualsVsCompareTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s1; String s2;
        
        s1 = "LHola";
        s2 = "Mundo";
        
        
        System.out.println("Equals => "+ s1.equals(s2));
        System.out.println("CompareTO => "+ s1.compareTo(s2));
        
       
    }
    
}
