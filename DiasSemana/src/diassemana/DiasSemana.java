package diassemana;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class DiasSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entre 1 y 7");
        dia = leer.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia no valido");

        }
    }
    
}
