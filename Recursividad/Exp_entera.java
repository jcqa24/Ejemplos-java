package Recursividad;

import java.util.Scanner;

public class Exp_entera {
	public static int expR(int a, int b){
		int temp;
		if (b==0){
			return 1;
		}else {
			if(b % 2 == 0){
				temp = expR(a, b / 2);
				return temp*temp;
			}else{
				return a*expR(a,b-1);
			}
		}
	}
	
	public static void main(String[] args) {
		int a, b;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresa la base");
		a=leer.nextInt();
		System.out.println("Ingresa el exponente");
		b=leer.nextInt();
		while (a<0 && b<0){
			System.out.println("Los numeros deben de ser mayor o igial 0");
		System.out.println("Ingresa la base");
		a=leer.nextInt();
		System.out.println("Ingresa el exponente");
		b=leer.nextInt();
		}
		while(a==0 & b==0){
			System.out.println("a y b no pueden ser 0 al mismo tiempo");
			System.out.println("Ingresa la base");
			a=leer.nextInt();
			System.out.println("Ingresa el exponente");
			b=leer.nextInt();
		}
		System.out.println(a+" elevado a la potencia "+b+" es "+expR(a,b));
	}
}
