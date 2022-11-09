public class GastoTrimestre {
    private static final int JANEIRO = 10000;
    private static final int FEVEREIRO = 23000;
    private static final int MARCO = 17000;

    private static int somaTrimestral(){
        return (JANEIRO+FEVEREIRO+MARCO);
    }

    public static void main(String[] args) {

        System.out.println("A empresa XPTO S.A teve um gasto total  no primeiro trimestre de: R$"+somaTrimestral()+".");

    }
}
