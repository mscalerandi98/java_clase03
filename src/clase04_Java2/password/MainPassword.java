package clase04_Java2.password;

public class MainPassword {
    public static void main(String[] args) {
        System.out.println("-------- SimplePassword ---------------------");

        Password pass1 = new SimplePassword(); //5 caracteres
        String[] passwords1 = {"1368","abcd","44444","3 5 4 3"};
        for (String s : passwords1) {
            try {
                pass1.setPassword(s);
                System.out.println(s + " --> " + "Password seteado correctamente");
            } catch (PasswordException e) {
                System.out.println(s + " --> " + e.getMessage());
            }
        }

        System.out.println("-------- PasswordIntermedia ---------------------");

            Password pass2 = new PasswordIntermedia(); // contraseña intermedia, minimo 8 caracteres, con una letra y un numero
            String[] passwords2 = {"987654321","1234abcd","sd","HOLO1234"};
            for (String s : passwords2) {
                try {
                    pass2.setPassword(s);
                    System.out.println(s + " --> " + "Password seteado correctamente");
                } catch (PasswordException e) {
                    System.out.println(s + " --> " + e.getMessage());
                }
            }

        System.out.println("-------- PasswordFuerte ---------------------");

        Password pass3 = new PasswordFuerte(); //10 caracteres,letra mayuscula y
        // otra minuscula, un caracter especial y un numero
        String[] passwords3 = {"12345678","1234@lsadjknlaksjdlkjsadl","smessiI7%s","·&$/&%$·"};
        for (String s : passwords3) {
            try {
                pass3.setPassword(s);
                System.out.println(s + " --> " + "Password seteado correctamente");
            } catch (PasswordException e) {
                System.out.println(s + " --> " + e.getMessage());
            }
        }
        }

}
