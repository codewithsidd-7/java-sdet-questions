package strings;

public class Palindrome {
    public static void main(String[] args) {
        String original = "level";
        String palindrome = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            palindrome += original.charAt(i);
        }

        if (palindrome.equals(original)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }


    }
}
