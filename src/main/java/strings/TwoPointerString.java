package strings;

import java.util.Locale;

public class TwoPointerString {
    public static void main(String[] args) {
        String str = "madam";
        str = str.toLowerCase(Locale.ROOT);
        System.out.println(isPalindrome(str));

    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }

            left++;
            right--;

        }
        return true;
    }
}


