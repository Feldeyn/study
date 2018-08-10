package lesson13;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        print(new Locale("ru", "RU"));
        print(Locale.ENGLISH);
        print(new Locale("uk", "UA"));
    }

    public static void print(Locale locale) throws UnsupportedEncodingException {

        ResourceBundle rb = ResourceBundle.getBundle("text", locale);
        for (String key : rb.keySet()) {
            String value = rb.getString(key);
            value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
            System.out.println(key + "  " + value);
        }
    }
}