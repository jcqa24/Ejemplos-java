package Factorial;
import java.util.Scanner;

public class Principal {

	public static int factorial(int n){
		if(n==0){
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
	
	public static void main(String[] args) {	
		Scanner leer = new Scanner(System.in);
		int n ;
		System.out.println("Ingresa el numero ");
		n=leer.nextInt();
		while(n<=0){
			System.out.println("el numero debe ser mayor a 0");
			System.out.println("Ingresa el numero ");
			n=leer.nextInt();
		}
		System.out.println("El feactorial del numero "+n+" es "+factorial(n));
	}

}
