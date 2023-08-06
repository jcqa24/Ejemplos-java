import java.util.Arrays;

public class Main {
    public static boolean esAnagrama(String word1,String word2){
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        if(word1.length() != word2.length()){
            return false;
        }

        // Amor -> Amro
        // roma -> amro

        char [] arr1 = word1.toCharArray();
        char [] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }

    public static void main(String[] args) {
        String word1 = "cuaderno";
        String word2 = "EducaronAaS";

        if(esAnagrama(word1,word2)){
            System.out.println("La palabras son anagramas");
        }else{
            System.out.println("La palabras no son anagramas");
        }
    }
}