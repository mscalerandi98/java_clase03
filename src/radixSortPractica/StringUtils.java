package radixSortPractica;/* Ejercicio 6
Partiendo de la clase StringUtil (que usamos para resolver Radix Sort), agregar los siguientes
métodos estáticos:
● public static String rpad(String s,char c,int n); idem lpad, pero agregando caracteres a
la derecha.
● public static String ltrim(String s); Retorna una cadena idéntica a s pero sin espacios a
la izquierda.
● public static String rtrim(String s); idem ltrim, pero sin espacios a la derecha.
● public static String trim(String s); idem lpad, pero sin espacios a derecha ni izquierda.
● public static int indexOfN(String s,char c,int n); Retorna la posición de la n-ésima
ocurrencia del carácter c dentro de s, o -1 si s no contiene a c. Por ejemplo, si s =
“John|Paul|George|Ringo”, c = ‘|’ y n=2, la función debe retornar la posicióon de la
segunda ocurrencia del carácter ‘|’ (pipe) dentro de la cadena s. Que, en este caso, es: 9.*/

public class StringUtils {

        // Retorna una cadena compuesta por n caracteres c
        // Ejemplo: replicate('x',5) ==> 'xxxxx'
        public static String replicate(char c, int n)
        {
            String out = null;

            if (n > 0) {
                out = String.valueOf(c);
                for (int i = 1; i < n; i++) {
                    out += String.valueOf(c);
                }
            }

            return out;
        }

        // Retorna una cadena de longitud n, compuesta por s
        // y precedida de tantos caracteres c como sea necesario
        // para completar la longitud mencionada
        // Ejemplo lpad("5",3,'0') ==> "005"
        public static String lpad(String s, int n, char c)
        {
            if (s.length() < n) {
                return replicate(c,n - s.length()) + s;
            } else {
                return s;
            }
        }

        // Retorna un String[] conteniendo los elementos de arr
        // representados como cadenas de caracteres
        public static String[] toStringArray(int arr[])
        {
            int n = arr.length;
            String[] out = new String[n];

            for (int i = 0; i < n; i++) {
                out[i] = Integer.toString(arr[i]);
            }

            return out;
        }

        // Retorna un String[] conteniendo los elementos de arr
        // representados como cadenas de caracteres
        public static int[] toIntArray(String arr[])
        {
            int n = arr.length;
            int[] out = new int[n];

            for (int i = 0; i < n; i++) {
                out[i] = Integer.parseInt(arr[i]);
            }

            return out;
        }

        // Retorna la longitud del elemento con mayor cantidad
        // de caracteres del array arr
        public static int maxLength(String arr[])
        {
            int[] array = toIntArray(arr);
            int max = Integer.MIN_VALUE;

            for (int n : array) {
                max = Math.max(max,n);
            }

            return Integer.toString(max).length();
        }

        // Completa los elemento del arr agregando caracteres c
        // a la izquierda, dejando a todos con la longitud del mayor
        public static void lNormalize(String arr[], char c)
        {
            int maxLnegth = maxLength(arr);
            int n = arr.length;
            String[] output = new String[n];

            for (int i = 0; i < n; i++) {
                output[i] = lpad(arr[i],maxLnegth,c);
            }

            for (int i = 0; i < n; i++) {
                arr[i] = output[i];
            }
        }

    public static String rpad(String s,char c,int n)
    {
        if (s.length() < n) {
            return s + replicate(c,n - s.length());
        } else {
            return s;
        }
    }

    public static String ltrim(String s)
    {
        int i = 0;
        while (i < s.length() && Character.isWhitespace(s.charAt(i))) {
            i++;
        }
        String ltrim = s.substring(i);

        return ltrim;
    }

    public static String rtrim(String s)
    {
        int i = s.length()-1;
        while (i >= 0 && Character.isWhitespace(s.charAt(i))) {
            i--;
        }
        String rtrim = s.substring(0,i+1);

        return rtrim;
    }

    public static String trim(String s)
    {
        String trim;
        trim = ltrim(s);
        trim = rtrim(s);

        return trim;
    }

    public static int indexOfN(String s,char c,int n)
    {
        int pos = s.indexOf(c);
        while (--n > 0 && pos != -1)
            pos = s.indexOf(c, pos + 1);
        return pos;
    }
    }

