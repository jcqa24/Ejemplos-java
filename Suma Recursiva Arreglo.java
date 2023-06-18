
public class Main {

    public static int sumaArregloRecursivo(int [] A,int i){
        if(i == A.length){
            return 0;
        }else{
            return A[i] + sumaArregloRecursivo(A,i+1);
        }

    }

    public static void main(String[] args) {
        int [] A = {1,2,3,4,5,10};
        int resultado;
        // (i=0;i<A.length;i++)
        // resultado += A[i]
        resultado = sumaArregloRecursivo(A,0);
        System.out.println("La suma de los elementos del arreglo es: "+resultado);
    }
}