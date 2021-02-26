package clase05_Java3.sorts;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class MyFactory {
    private String propFileName = "MiFactory.properties";

    public Object getInstance(String objName) {
        Object result = null;

        try {
            Properties prop = new Properties();

                prop.load(new FileInputStream(propFileName));
                String sortedClassName = prop.getProperty("sorter");
                Class sortedClass = Class.forName(sortedClassName);
                Constructor constructor = sortedClass.getConstructor();
                result = constructor.newInstance();

          //  result = Class.forName(prop.getProperty(objName)).getConstructor().newInstance();

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        return result;
    }
}
