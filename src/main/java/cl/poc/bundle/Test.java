package cl.poc.bundle;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class Test {

    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");

        try {

            ResourceBundle resourceBundle = ResourceBundle.getBundle("cl.poc.bundle.R", locale);
            Enumeration<String> keys = resourceBundle.getKeys();

            while (keys.hasMoreElements()) {
                String val = keys.nextElement();
                System.out.println(resourceBundle.getString(val));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
