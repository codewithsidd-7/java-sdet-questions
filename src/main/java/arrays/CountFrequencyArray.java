package arrays;

import java.util.HashMap;

public class CountFrequencyArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 2, 5, 7, 2, 4};
        countFrequency(arr);
    }

    public static void countFrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
                map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);


    }
}
