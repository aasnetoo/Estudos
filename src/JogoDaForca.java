import java.util.Arrays;
import java.util.Scanner;

public class JogoDaForca {
    private static final String PALAVRA_FORCA = "CACHORRO";

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        try(Scanner scan = new Scanner(System.in)){

            System.out.println("Bem vindo ao Jogo da Forca");
            System.out.println("Deseja começar a jogar? 'Y' para sim");
            String resp = scan.nextLine();
            char[] forca = PALAVRA_FORCA.toCharArray();
            String a = "_";
            char[] resposta = new char[forca.length];
            Arrays.fill(resposta, a.charAt(0));
            int cont = 0;
            if (resp.equalsIgnoreCase("y")){
                System.out.println("Forca: ");
                for (int i = 0; i < forca.length; i++) {
                    System.out.print("_");
                }
                while(tentativasForca(cont, forca.length) && !compararResultado(forca,resposta)) {
                    System.out.println("\nDigite um caractere: ");
                    String carac = scan.nextLine().toUpperCase();
                    if (!Character.isAlphabetic(carac.charAt(0))){
                        System.out.println("Digite um caractere válido.");
                        continue;
                    }else{

                        for (int j = 0; j < forca.length; j++) {
                            if (carac.equalsIgnoreCase(String.valueOf((forca[j])))) {
                                resposta[j] = carac.charAt(0);
                            }

                        }
                        for (Character respForca : resposta) {
                            System.out.print(respForca);
                        }
                        cont+=1;
                    }
                }
            }
            if (compararResultado(forca,resposta)){
                System.out.println("\nPARABÉNSS!! VOCÊ ACERTOU A PALAVRA CORRETA!! ");
            }
            else{
                System.out.println("\nInfelizmente, não foi dessa vez! A palavra correta era: "+PALAVRA_FORCA);
            }
            System.out.println("-----------------------------------------");
            System.out.println("Fim de Jogo.");
        }


    }
    private static boolean compararResultado(char[] b, char[] c){
        return Arrays.equals(b,c);
    }
    private static boolean tentativasForca(int a, int b){
        return a<(b+3);
    }

}
