package criacao;

public class Emprestimo {

    public static double valorFinal(double valorInicial, int parcelas) {
        double taxa;

        if (parcelas < 12) {
            taxa = 1.2 / 100;
        } else if (parcelas > 12 && parcelas < 24) {
            taxa = 1.8 / 100;
        } else {
            taxa = 2.5 / 100;
        }

        return Math.round((valorInicial * Math.pow((1 + taxa), parcelas)));
    }
}
