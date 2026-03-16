package hashmap;

import java.util.HashSet;

public class FindDuplicateNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 3};
        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int currentNumber = arr[i];

            if (seen.contains(currentNumber)) {
                System.out.println(currentNumber);

            } else {
                seen.add(currentNumber);

            }
        }
    }
}
