
package stringcompare;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class StringCompare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "Mundo";
        
        if(s2.compareToIgnoreCase(s1) == 0)
            System.out.println("Las cadenas son iguales");
        else
            System.out.println("Las cadenas son diferentes");
    }
    
}
