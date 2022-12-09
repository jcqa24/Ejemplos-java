package busquedarecursivabinaria;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class BusquedaRecursivaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int A [] = {1,2,3,4,5,6,7,8,9,10};
        
        int pos = BusquedaBinaria(A,15,0,A.length-1);
        
        if(pos == -1){
            System.out.println("El valor no esta en el arreglo");
        }else{
            System.out.println("El dato se encuentra en la posicion: "+pos);
        }
        
        
    }   
    
    
    public static int BusquedaBinaria(int [] A, int dato, int inicio, int fin){
        int mitad = (inicio + fin)/2;
        
        //Caso base
        if(A[mitad] == dato){
            return mitad+1;
        }
        if(inicio > fin){
            return -1;
        }
        
        //Caso general
        
        if(dato < A[mitad]){
            return BusquedaBinaria(A, dato, inicio, mitad -1);
        }else{
            return BusquedaBinaria(A, dato, mitad +1, fin);
        }
    }
    
}
