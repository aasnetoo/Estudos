import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b){
        if (a.length() != b.length()){
            return false;
        }
        String aU = a.toUpperCase();
        String bU = b.toUpperCase();
        char[] a1 = aU.toCharArray();
        System.out.println(a1);
        char[] a2 = bU.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(a1);
        return Arrays.equals(a1,a2);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        boolean ret = isAnagram(a,b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}


