/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comarray;

import java.util.Arrays;


/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class ComArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        double [] A = {1,2,3,4,5};
        double [] B = {1,2,3,4,5};
        
        if(Arrays.equals(A,B) ){
            System.out.println("Los arreglos son iguales");
        }else{
            System.out.println("Los arreglos son diferentes");
        }
    }
    
}
