import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static int Busqueda(int[] A, int dato) {
        int i, pos = -1;
        for (i = 0; i < A.length; i++) {
            if (dato == A[i]) {
                pos = i;

                break;
            }
        }
        return pos;
    }
    public static ArrayList<Integer> Union(int [] A, int [] B){
        ArrayList<Integer> union = new ArrayList<Integer>();
        int i,index;
        for(i=0;i<A.length;i++){
            //union[i] = A[i];
            union.add(A[i]);
        }

        //index = A.length;

        for(i=0;i<B.length;i++){
            if(Busqueda(A,B[i]) == -1){
                //union[index] = B[i];
                //index++;
                union.add(B[i]);
            }
        }

        return union;
    }

    public static ArrayList<Integer> Interseccion(int[] A, int [] B){
       /** int tam;
        if(A.length< B.length){
            tam = A.length;
        }else{
           tam = B.length;
        }*/

        ArrayList<Integer> inter = new ArrayList<Integer>();
        int i,index = 0;

        for(i=0;i<A.length;i++){
            if(Busqueda(B,A[i]) != -1 ){
                inter.add(A[i]);
                //inter[index] = A[i];
                //index++;
            }
        }

        return inter;

    }

    public static void main(String[] args) {
       int [] A = {1,2,3,7,8,4,5};
       int [] B = {4,5,6,1,2,3};

        ArrayList<Integer> u = Union(A,B);

        ArrayList<Integer> n = Interseccion(A,B);

        System.out.println(n.toString());

        //System.out.println(u.toString());


    }
}