package ofuscacionbasicatexto;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class OfuscacionBasicaTexto {

    // a/A -> 4
    // e/E -> 3
    // i/I -> 1
    // o/O -> 0
    // s/S -> 5
    // t/T -> 7
    
    
    public static String ofus1(String cadena){
        int i;
        String resultado = "";
        char c [] = cadena.toCharArray();
        for(i=0 ; i < c.length; i++){
            if(c[i] == 'A' || c[i] == 'a'){
                resultado += "4";
            }else if(c[i] == 'E' || c[i] == 'e'){
                resultado += "3";
            }else if(c[i] == 'I' || c[i] == 'i'){
                resultado += "1";
            }else if(c[i] == 'O' || c[i] == 'o'){
                resultado += "0";
            }else if(c[i] == 'S' || c[i] == 's'){
                resultado += "5";
            }else if(c[i] == 'T' || c[i] == 't'){
                resultado += "7";
            }else{
                resultado += c[i];
            }
        
        
        }
        
        return resultado;
        
    }
    
    public static String ofus2(String cadena){
        cadena = cadena.replaceAll("A|a", "4");
        cadena = cadena.replaceAll("E|e", "3");
        cadena = cadena.replaceAll("I|i", "1");
        cadena = cadena.replaceAll("O|o", "0");
        cadena = cadena.replaceAll("S|s", "5");
        cadena = cadena.replaceAll("T|t", "7");
        
        
        return cadena;
        
    }
    
    public static void main(String[] args) {
        String c1,c2, cadena = "A a E e I i O o S s T t b R P Q";
        
        System.out.println(cadena);
        
        c1 = ofus1(cadena);
        
        System.out.println(c1);
        
        
        c2 = ofus2(cadena);
        
        System.out.println(c2);
    }
    
}
