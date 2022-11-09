import java.util.Scanner;

public class Losango {

    public static boolean ePar(int quantidade){
        return quantidade % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int quantidade = sc.nextInt();
        if (quantidade >= 5){
            for (int j = quantidade/2; j > 1; j--) {
                for (int i = 0; i < quantidade; i++) {
                    System.out.print("*");
                }
                System.out.println();
                for (int k = 0; k < quantidade; k++) {
                    if (k == (quantidade/2) && !ePar(quantidade)) {
                        System.out.print(" ");
                    }
                    else if(k == (quantidade/2)-1 && ePar(quantidade)){
                        System.out.print("  ");
                        k=k+1;
                    }
                    else{
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
}
