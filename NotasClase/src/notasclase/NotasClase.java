package notasclase;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class NotasClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float calificacion;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el promedio del alumno");
        calificacion = leer.nextFloat();
        
        if( calificacion < 0 || calificacion >10){
            System.out.println("Calificacion no valida");
        }else if(calificacion < 6.0){
            System.out.println("No Acreditado");
        }else if(calificacion < 7.5){
            System.out.println("Suficiente");
        }else if( calificacion < 8.5){
            System.out.println("Bien");
        }else{
            System.out.println("Muy bien");
        }
    }
    
}
