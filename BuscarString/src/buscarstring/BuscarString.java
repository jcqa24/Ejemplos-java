package buscarstring;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class BuscarString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "Hola Mundo";
        String s2 = "Hola";
    
        
        
        if(s1.indexOf(s2,5) >=0)
            System.out.println("Se encontro la cadena");
        else
            System.out.println("No se encontro la cadena");
    
    }
    
}
