
package stringchar;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class StringChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "Hola mundo";
        char a;
        char []b;
        a = s1.charAt(s1.length()-1);
        
        System.out.println(a);
        
        b = s1.toCharArray();
        
        b[5] = 'x';
        
        System.out.println(b);
    }
    
}
