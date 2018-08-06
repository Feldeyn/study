package lesson12;

public class StringBuilderDemo {
    public static void main(String[] args) {
        stroka(3, 56);
    }

    public static void stroka(int a, int b) {
        StringBuilder sb = new StringBuilder();
        sb.append(a).append("+").append(b);
        sb.append("=").append(a + b).append("\n");
        sb.append(a).append("-").append(b).append("=").append(a - b).append("\n");
        sb.append(a).append("*").append(b).append("=").append(a * b);
        replace1(sb, "=", " равно ");
    }

    public static void replace1(StringBuilder sb, String subString, String newString) {
        int k = 0;
        while ((k = sb.indexOf(subString)) != -1) {
            //    sb.deleteCharAt(k).insert(k, newString);

            sb.replace(k, k + subString.length(), newString);
        }
        System.out.println(sb);
    }
}

