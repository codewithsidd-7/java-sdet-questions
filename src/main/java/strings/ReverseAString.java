package strings;

public class ReverseAString {
    public static void main(String[] args) {
        String original = "Aeroplane";
        String reversed = "";

        for(int i = original.length()-1;i>=0; i-- ){
            reversed +=original.charAt(i);
        }
        System.out.println("Original string = " +original);
        System.out.println("Output after reversing a string = " +reversed);

    }
}
