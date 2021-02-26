package clase04_Java2.password;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    private String regex;
    private Pattern pattern;
    private String password;

    public Password(String regex) {
        this.regex = regex;
        this.pattern = Pattern.compile(regex);
    }
    public void setPassword(String pass) throws PasswordException {

        Matcher matcher = pattern.matcher(pass);
        if (matcher.find()) this.password = pass;
        else throw new PasswordException();
    }
}
