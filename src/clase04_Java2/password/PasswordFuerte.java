package clase04_Java2.password;

public class PasswordFuerte extends  Password{
    private static final String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&+=]).{10,}$";

    public PasswordFuerte() { super(regex); }
}
