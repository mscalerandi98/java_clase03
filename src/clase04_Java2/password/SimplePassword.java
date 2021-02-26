package clase04_Java2.password;

public class SimplePassword extends Password{

    private static final String regex = "^.{5,}$";

    public SimplePassword() {
        super(regex);
    }


}
