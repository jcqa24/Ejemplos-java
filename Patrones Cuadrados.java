public class Main {

    public static void fill(int f, int c){
        int i,j;

        for(i=1;i<=f;i++){
            for(j=1;j<=c;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void margin(int f, int c){
        int i,j;
        for(i=1;i<=f;i++){
            for(j=1;j<=c;j++){
                if( i == 1 || i == f || j == 1 || j ==c){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        fill(6,6);
        System.out.println("\n\n");
        margin(3,6);
    }
}