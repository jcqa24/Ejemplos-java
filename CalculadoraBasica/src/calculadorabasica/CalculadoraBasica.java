/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorabasica;
import java.util.Scanner;
/**
 *
 * @author garrobo
 */
public class CalculadoraBasica {

    /**
     * @param args the command line arguments
     */
    public static void Menu(){
        System.out.println("1.Suma \n"
                + "2.Resta\n"
                + "3.Divicion\n"
                + "4.Multiplicacion\n"
                + "5.Salir");
        
    }
    public static int Suma(int a, int b){
        int suma;
        suma = a + b;
    return(suma);
    }
    public static int Resta(int a, int b){
        int resta;
        resta = a - b;
    return(resta);
    }
    public static int Divicion(int a, int b){
        int div;
        div = a / b;
    return(div);
    }
    public static int Multi(int a, int b){
        int multi;
        multi = a * b;
    return(multi);
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Calculadora Basica v1");
        int a,b,opc = 0;
        do {
            System.out.println("Ingresa una opcion");
            Menu();
            opc=leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingresa el primer numero");
                    a = leer.nextInt();
                    System.out.println("Ingresa el segundo numero");
                    b=leer.nextInt();
                    System.out.println("El resultado de la suma es: "+Suma(a,b));
                    break;
                case 2:
                    System.out.println("Ingresa el primer numero");
                    a = leer.nextInt();
                    System.out.println("Ingresa el segundo numero");
                    b=leer.nextInt();
                    System.out.println("El resultado de la resta es: "+Resta(a,b));
                    break;           
                case 3:
                    System.out.println("Ingresa el primer numero");
                    a = leer.nextInt();
                    System.out.println("Ingresa el segundo numero");
                    b=leer.nextInt();
                    while (b==0) {                        
                        System.out.println("No puedes divir entre 0 \n Ingresa otro numero");
                        b=leer.nextInt();
                    }
                    System.out.println("El resultado de la divicion es: "+Divicion(a,b));
                    break;
                case 4:
                    System.out.println("Ingresa el primer numero");
                    a = leer.nextInt();
                    System.out.println("Ingresa el segundo numero");
                    b=leer.nextInt();
                    System.out.println("El resultado de la multiplicacion es: "+Multi(a,b));
                    break;
                case 5:
                    System.out.println("Adios!!!");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opc != 5);
        
    }
    
}
