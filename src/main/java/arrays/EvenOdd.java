package arrays;

public class EvenOdd {
    public static void main(String[] args) {
        int num = 8;

        while (num>1){
            num=num-2;
        }
        if (num==0){
            System.out.println("Even");
        }
        else if (num==1){
            System.out.println("Odd");
        }

    }
}
