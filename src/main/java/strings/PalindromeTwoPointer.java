package strings;

public class PalindromeTwoPointer {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        input = input.toLowerCase();

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {

            // skip invalid left
            if (!Character.isLetterOrDigit(input.charAt(left))) {
                left++;
                continue;
            }

            // skip invalid right
            if (!Character.isLetterOrDigit(input.charAt(right))) {
                right--;
                continue;
            }

            // compare characters
            if (input.charAt(left) != input.charAt(right)) {
                System.out.println("false");
                return;
            }

            // move both pointers
            left++;
            right--;
        }

        System.out.println("true");
    }
}