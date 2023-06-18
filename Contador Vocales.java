import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        int count = 0, i;
        char letra;

        System.out.println("Ingresa una frase: ");
        cadena = leer.nextLine();

        for(i=0;i<cadena.length();i++){
            letra = Character.toLowerCase(cadena.charAt(i));
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                count++;
            }
        }

        System.out.println("La cantidad de vocales en la frase es: "+count);

    }
}