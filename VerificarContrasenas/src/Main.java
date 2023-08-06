public class Main {

    public static boolean isSecurePassword(String password){
        if(password.length() < 8){
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        for(char c : password.toCharArray()){
            if(Character.isUpperCase(c)){
                hasUppercase = true;
            }else if(Character.isLowerCase(c)){
                hasLowercase = true;
            }else if(Character.isDigit(c)){
                hasNumber = true;
            }else{
                hasSpecialChar = true;
            }
        }

        return hasUppercase && hasLowercase && hasNumber && hasSpecialChar;
    }

    public static void main(String[] args) {
        String password = "1EeAqs123fgh!";
        boolean isSecure = isSecurePassword(password);

        if(isSecure){
            System.out.println("La contraseña es segura");
        }else{
            System.out.println("La contraseña no es segura");
        }

    }
}