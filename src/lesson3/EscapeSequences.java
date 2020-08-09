package lesson3;

public class EscapeSequences {
    public static void main(String[] args) {
        String a = "\tA"; // tab
        String b = "\nB"; // newline
        String c = "\"C\""; // double quotes
        String d = "\\D\\"; // backslash
        System.out.println(a + b + c + d);
    }
}
