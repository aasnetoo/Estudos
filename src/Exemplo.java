import java.util.Scanner;

public class Exemplo {

    public static boolean verificador (int numero){
        return numero % 2 != 0;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (verificador(numero)){
                System.out.println("O numero é impar.");
                System.out.println(numero);
            }
        else{
                System.out.println("O numero é par.");
                System.out.println(numero);
            }
        }
}
