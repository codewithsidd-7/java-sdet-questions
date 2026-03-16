package arrays;

public class FindLargestNumber {
    public static void main(String[] args) {
        int[] arr = {12, 54, 46, 235, 76, 346, 64, 3,1000};
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                largest= arr[i];

            }
        }
        System.out.println(largest);
    }
}
