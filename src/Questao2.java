import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade = scan.nextInt();
        scan.close();
        final double CONSTANTE = 0.23;
        double soma = (double) idade +CONSTANTE;
        System.out.println("O número da sorte é: "+soma);

    }
}
