/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo2;

import java.util.Scanner;

/**
 *
 * @author garrobo
 */
public class Palindromo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] Palindromo;
        int izq, der;
        System.out.println("Ingresa la palabra");  
        String Palabra = s.nextLine();
        Palindromo = Palabra.toCharArray();
        izq = 0;
        der = Palindromo.length-1;
        
        while(izq<der){
            if (Palindromo[izq] == Palindromo[der]){
                izq ++;
                der--;
            }else{
                System.out.println(Palabra + " No es palindromo");
                break;
            }
        
        }
        if(izq == der){
            System.out.println(Palabra + " Es un palindromo");
        }
        
        
  
        
        
    }
    
}
