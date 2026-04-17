package hashmap;

import java.util.HashMap;

public class FirstNonRepeatingCharFunc {
    public static void main(String[] args) {
        String str = "Automation";
        str=str.toLowerCase();
        System.out.println(firstNonRepeating(str));
    }

    public static char firstNonRepeating(String str) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return '#';
    }
}
