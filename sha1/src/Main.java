import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
    
    public static String SHA1(String texto){
        try {
            MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
            
            byte [] messageBytes = texto.getBytes();
            
            byte [] hashBytes = sha1.digest(messageBytes);
            
            StringBuilder sb = new StringBuilder();
            
            for(byte b : hashBytes){
                sb.append(String.format("%02x",b));
            }
            
            String sha1Hash = sb.toString();
            return sha1Hash;
            
            
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        
    }

    public static void main(String[] args) {
        String texto = "HolA mundo";

        System.out.println(SHA1(texto));
    }
}