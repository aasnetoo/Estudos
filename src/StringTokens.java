import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (s.trim().isEmpty()){
            System.out.println("0");

        }
        else{
            String[] sSpace;
            sSpace = s.trim().split("[ !,?._'@]+");
            System.out.println(sSpace.length);
            for (String value : sSpace) {
                System.out.println(value);
            }
            scan.close();
        }
    }
}



