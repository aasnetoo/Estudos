import java.util.Scanner;

public class StringStudy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int C = A.length() + B.length();
        System.out.println(C);
        int compare = A.compareTo(B);
        if (compare>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        String outputA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String outputB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(outputA+" "+outputB);
    }


}

