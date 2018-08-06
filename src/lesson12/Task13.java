package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task13 {
    public static void main(String[] args) {
        String regect="[a-zA-Z]+\\s";
                String s="One two three раз два три one1 two2 123 ";
        Pattern pattern=Pattern.compile(regect);
        Matcher matcher= pattern.matcher(s);
        int count=0;
        while (matcher.find()){
            count++;
            System.out.println(matcher.group());
        }
        System.out.println(count);
    }
}
