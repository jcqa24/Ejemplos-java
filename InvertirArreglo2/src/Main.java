public class Main {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5,6,7,8,9};
        int inicio,fin, i, aux;

        System.out.println("Arreglo original");
        for(i=0;i<A.length;i++){
            System.out.print(A[i] + " ");
        }

        inicio = 0;
        fin = A.length-1;

        while(inicio < fin){
            aux = A[inicio];
            A[inicio] = A[fin];
            A[fin] = aux;

            inicio++;
            fin--;

        }

        System.out.println("\nArreglo invertido");
        for(i=0;i<A.length;i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();

    }
}