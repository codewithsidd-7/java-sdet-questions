package hashmap;

import java.util.HashMap;

public class CountFrequencyOfCharactersInString {
    public static void main(String[] args) {
        String str = "Automation";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
    }
}

