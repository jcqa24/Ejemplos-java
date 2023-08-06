import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static String sha256(String mensaje){
        try {
            MessageDigest sha = MessageDigest.getInstance("SHA-512");
            byte [] digest = sha.digest(mensaje.getBytes());

            StringBuilder hexString = new StringBuilder();

            for(byte b : digest){
                hexString.append(String.format("%02x",b));
            }

            return hexString.toString();


        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        String mensaje = "Hola Mundo";
        System.out.println("La cadena cifrada es: "+sha256(mensaje));
    }
}