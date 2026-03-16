package strings;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String str = "automation";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String str1 = String.valueOf(ch);

            if (!result.contains(str1)) {
                result = result + ch;
            }
        }

        System.out.println(result);
    }
}