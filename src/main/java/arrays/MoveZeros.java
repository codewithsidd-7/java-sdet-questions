package arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (num != 0) {
                arr[index] = num;
                index++;

            }
        }

        for (int i = index; i < arr.length; i++) {
              arr[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



    }
}
