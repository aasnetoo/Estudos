public class SettersAndGetters {

    /*
    Atributos do aluno - Ex para estudo.
     */
    private String nome;
    private String dataNascimento;
    private int idade;
    private double nota1;
    private double nota2;

    public void Aluno(String nomePadrao){
        nome = nomePadrao;

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNota2(double nota2){
        this.nota1 = nota2;
    }

    public double getNota2(){
        return nota2;
    }

    public void setNota1(double nota1){
        this.nota2 = nota1;
    }

    public double getNota1(){
        return nota1;
    }

    public double mediaAlunos (){
        return (nota1 + nota2)/2;
    }

    public boolean verificaAprovacao(){
        double media = this.mediaAlunos();
        if (media>=70){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        /*
        O método SET é para adicionar ou receber dados para os atributos.
        O método GET é para resgastar ou obter o valor do atributo.
         */
        SettersAndGetters Aluno1 = new SettersAndGetters();
        Aluno1.setNome("Neto");
        System.out.println(Aluno1.getNome());
        Aluno1.setNota1(80.0);
        Aluno1.setNota2(75.0);
        System.out.println(Aluno1.mediaAlunos());
        System.out.println(Aluno1.verificaAprovacao() ? "Aprovado" : "Reprovado");

    }
}
