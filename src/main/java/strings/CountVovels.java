package strings;

public class CountVovels {
    public static void main(String[] args) {
        String str = "automation";
        int vovels = 0;
        int consonants=0;

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vovels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("Number of vovels is "+ vovels);
        System.out.println("Number of consonants is "+ consonants);
    }
}
