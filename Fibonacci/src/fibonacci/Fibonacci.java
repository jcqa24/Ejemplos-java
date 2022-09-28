/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author garrobo
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc; 
        Scanner s = new Scanner(System.in);
        
        opc = s.nextInt();
        
        switch (opc) {
            case 1:
                //System.out.println("N-esimo numero de fib....");
                NFibonacci();
                break;
            case 2:
                System.out.println("N primeros.....");
                NprimeosFb();
                break;
            case 3:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opcion no valida");
        }
        
    }
    
    
}
