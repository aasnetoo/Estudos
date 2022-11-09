import javax.swing.*;

public class Teste {

    public static void main(String args[]) {
        int i;
        int k;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor de 'n'?"));

        for (i = n; i >= 1; i--) {
            for (k = 1; k < i; k++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (k = -i - 1; k >= i - n * 2 + 1; k--) {
                System.out.print(" ");
            }
            if (k == -i - 1) {
                System.out.println(" ");
            } else
                System.out.println("*");
        }
        for (i = 1; i <= n - 1; i++) {
            System.out.print(" ");
            for (k = 1; k < i; k++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (k = -i * 3; k >= -i - n * 2 + 4; k--) {
                System.out.print(" ");
            }
            if (k == -i * 3) {
                System.out.println(" ");
            } else
                System.out.println("*");

        }
    }
}