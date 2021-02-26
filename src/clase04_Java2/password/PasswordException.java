package clase04_Java2.password;

public class PasswordException extends Exception{

    private static final String ERR = "Password invalida";

    public PasswordException() {
        super(ERR);
    }
}
