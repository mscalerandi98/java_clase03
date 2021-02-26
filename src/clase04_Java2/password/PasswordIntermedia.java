package clase04_Java2.password;

public class PasswordIntermedia extends Password{

    private static final String regex = "^(?=.*[0-9])(?=.*[a-zA-Z]).{8,}$";

    public PasswordIntermedia() {
        super(regex);
    }
}
