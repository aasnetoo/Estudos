import java.util.Arrays;
import java.util.Scanner;

public class Lexicographical {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int a = k;
        int i = 0;
        String[] lista = new String[s.length()/k];
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int j = 0; j < s.length(); j++) {
            lista[j]=s.substring(j, a);
            a++;

        }


        Arrays.sort(lista);
        int b = lista.length;
        System.out.println(Arrays.toString(lista));

        smallest = lista[0];
        largest = lista[b];



        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
