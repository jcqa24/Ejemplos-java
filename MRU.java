import java.util.Scanner;


// d = v*t
// v = d/t
// t = d/v


public class Main {
    public static void main(String[] args) {
        double distancia,tiempo, velocidad;
        int opc;
        Scanner leer = new Scanner(System.in);

        System.out.println("¿Qué quieres calcular \n 1- Distancia \n 2- Velocidad \n 3 - Tiempo");

        opc = leer.nextInt();

        switch (opc){
            case 1:
                System.out.println("Ingresa la velocidad");
                velocidad = leer.nextDouble();
                System.out.println("Ingresa el tiempo");
                tiempo = leer.nextDouble();
                distancia = velocidad * tiempo;
                System.out.println("La distancia recorrida es: "+distancia+ " m");
                break;
            case 2:
                System.out.println("Ingresa la distacia");
                distancia = leer.nextDouble();
                System.out.println("Ingresa el tiempo");
                tiempo = leer.nextDouble();
                velocidad = distancia / tiempo;
                System.out.println("La velocidad es: "+velocidad+ "m/s");
                break;
            case 3:
                System.out.println("Ingresa la distacia");
                distancia = leer.nextDouble();
                System.out.println("Ingresa la velocidad");
                velocidad = leer.nextDouble();
                tiempo = distancia / velocidad;
                System.out.println("El tiempo empleado es " +tiempo + " s");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}