package Mul_ent;
import java.util.Scanner;

public class Multi_entera {
	
	public static int Mult(int a, int b){
		if(a== 0 || b==0){
			return 0;
			
		}else {
			return a+Mult(a,b-1);
		}
	}
	
	public static void main(String[] argumentos){
		int a,b;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresa el primer numero");
		a=leer.nextInt();
		System.out.println("Ingresa el segundo numero");
		b=leer.nextInt();
		while(b<0 || a<0){
			System.out.println("Los numero deben ser positivos");
			System.out.println("Ingresa el primer numero");
			a=leer.nextInt();
			System.out.println("Ingresa el segundo numero");
			b=leer.nextInt();
		}
		System.out.println("La multiplicacion de "+a+" * "+b+" es= "+Mult(a,b));
	}

}
