
package promedios;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class Promedios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] A = {8,8,8,8,8,8,8,8,8,8,8,8};
        double  suma = 0, promedio;
        for (int i = 0; i < A.length; i++) {
            suma += A[i];
        }
        
        promedio = suma / A.length;
        
        System.out.println("El promedio del arreglo es: "+promedio);
    }
    
}
