import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {

    public static String md5encryp(String input){
        String output = "";

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            byte[] digest = md.digest(input.getBytes());

            StringBuilder sb = new StringBuilder();

            for(byte b : digest){
                sb.append(String.format("%02x",b));
            }

            output = sb.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        return output;

    }

    public static void main(String[] args) {
        String input = "ProgramatUtos";
        System.out.println(md5encryp(input));
    }
}