import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String newString = "";
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        for (int i = A.length()-1; i >= 0; i--) {
            newString = newString + A.charAt(i);
        }
        if (A.equals(newString)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
