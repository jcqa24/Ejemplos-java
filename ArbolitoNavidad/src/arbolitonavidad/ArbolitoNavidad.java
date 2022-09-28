package arbolitonavidad;

/**
 *
 * @author Juan Carlos Quiroz Aguilar
 */
public class ArbolitoNavidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        int rand, color = 0, n = 10;

        while (true) {
            for (int i = 0; i < n + (n / 2); i++) {
                for (int j = n + (n / 2); j > i; j--) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= 2 * i - 1; k++) {
                    rand = (int) (Math.random() * 101) + 1;
                    if (rand % 10 == 0) {
                        System.out.print("\u001B[34mo");
                    } else if(rand % 15 == 0) {
                        System.out.print("\u001B[35mo");
                    }else{
                        System.out.print("\u001B[32mo");
                    }
                }
                System.out.println("");

            }

            for (int i = 1; i < n - (n / 2); i++) {

                for (int j = n + (n / 2); j > 1; j--) {
                    System.out.print(" ");
                }

                System.out.println("\033[31m**");
            }
            
            if(color == 0){
                System.out.println("\n\n     \033[36m¡¡¡FELIZ NAVIDAD!!!");
                color = 1;
            }else if( color ==1){
                System.out.println("\n\n     \033[35m¡¡¡FELIZ NAVIDAD!!!");
                color = 2;
            }else{
                System.out.println("\n\n     \033[33m¡¡¡FELIZ NAVIDAD!!!");
                color =0;
            }
            
            
            
            Thread.sleep(1000);
            System.out.print("\033[H\033[2J");
            System.out.flush();

        }
    }
}
