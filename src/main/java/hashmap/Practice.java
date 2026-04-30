package hashmap;

import java.util.HashMap;

public class Practice {
    public static void main(String[] args) {


        int[] arr = {2, 7, 11, 15};
        int target = 9;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int needed = target - current;

            if (map.containsKey(needed)) {
                System.out.println(map.get(needed) + " " + i);
                return;
            }

            map.put(current, i);
        }

        System.out.println(map);


    }
}

