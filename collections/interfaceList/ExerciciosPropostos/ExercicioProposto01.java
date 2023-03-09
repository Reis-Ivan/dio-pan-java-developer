package interfaceList.ExerciciosPropostos;

/*
Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

import java.sql.SQLOutput;
import java.util.*;
import java.util.Scanner;

public class ExercicioProposto01 {
    public static void main(String[] args) {

        // Lista nome dos meses
        List<String> meses = Arrays.asList(
                "Janeiro", "Fevereiro", "Março",
                "Abril", "Maio", "Junho", "Julho");

        // Lista das temperaturas
        List<Double> temperaturas = new ArrayList<>();

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        // Leitura das tempeturas
        for (int i = 0; i < 6; i++) {
            System.out.println("Digite uma temperatura: ");
            temperaturas.add(sc.nextDouble());
        }
        sc.close();

        // Cálculo da média
        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;

        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        double media = soma / temperaturas.size();
        System.out.println(String.format("Média semestral: %.2f", media));
        System.out.println(" ");

        // Exibição dos meses acima da média
        System.out.println("Meses acima da média: ");
        for (double temp : temperaturas) {
            if (temp > media) {
                int index = temperaturas.indexOf(temp);
                System.out.println(meses.get(index) + " - " + temp + " ºC");
            }
        }

    }
}
