package strings;

public class StringManipulation {
    public static void main(String[] args) {
        String input = "a1b2c3$#4";
        //String is immutable in java
        //We use StringBuilder and StringBuffer to make it mutable
        int sum = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                sb.append(ch);
            } else if (Character.isDigit(ch)) {
                sum = sum + Character.getNumericValue(ch);
            }
        }
        System.out.println(sb);
        System.out.println(sum);
    }
}
