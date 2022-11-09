import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;

        while (sc.hasNext()){
            String frase = sc.nextLine();
            System.out.println(i+" "+frase);
            i++;
        }

    }
}
