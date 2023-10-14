import java.util.Scanner;

public class Main {

    public static double CalculoDescuento(double precioOriginal, double porcentajeDescuento){
        double descuento, precioFinal;
        descuento = (porcentajeDescuento/100) * precioOriginal;
        precioFinal = precioOriginal - descuento;

        return precioFinal;
    }

    public static void main(String[] args) {
            double precioOriginal, porcentajeDescuento;
            Scanner leer = new Scanner(System.in);

            do{
                System.out.println("Ingresa el precio original");
                precioOriginal = leer.nextDouble();

                if( precioOriginal <= 0){
                    System.out.println("La cantidad debe ser mayor a 0");
                }
            }while (precioOriginal <= 0);

            do{
                System.out.println("Ingresa el porcentaje de descuento 1%-99%");
                porcentajeDescuento = leer.nextDouble();
                if(porcentajeDescuento < 1 || porcentajeDescuento >99){
                    System.out.println("El porcentaje debe estar entre 1 y 99 porciento");
                }
            }while (porcentajeDescuento < 1 || porcentajeDescuento >99);

        System.out.println("El precio final de la compra es: "+CalculoDescuento(precioOriginal,porcentajeDescuento));
    }
}