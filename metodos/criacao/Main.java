package criacao;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("\nExercicio Calculadora");
        Calculadora.soma(10, 2);
        Calculadora.subtracao(10, 2);
        Calculadora.multiplicacao(10, 2);
        Calculadora.divisao(10, 2);

        //Mensagem
        System.out.println("\nExercicio Mensagem");
        Mensagem.saudacao(9);
        Mensagem.saudacao(13);
        Mensagem.saudacao(20);

        //Emprestimo
        System.out.println("\nExercicio Emprestimo");
        System.out.println(Emprestimo.valorFinal(1000, 10));
    }
}
