package interfaceSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);
Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/


public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        Set<Serie> minhasSeries = new HashSet<>();
        minhasSeries.add(new Serie("GoT", "fantasia", 60));
        minhasSeries.add(new Serie("Dark", "drama", 60));
        minhasSeries.add(new Serie("HIMYM", "comédia", 25));
        minhasSeries.add(new Serie("Rick and Morty", "comédia", 25));

        System.out.println("--\tOrdem aleatória\t---");
        for (Serie serie : minhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        System.out.println(" ");

        System.out.println("--\tOrdem inserção\t---");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Serie("GoT", "fantasia", 60));
            add(new Serie("Dark", "drama", 60));
            add(new Serie("HIMYM", "comédia", 25));
            add(new Serie("Rick and Morty", "comédia", 20));
        }};
        for (Serie serie : minhasSeries1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println(" ");
        System.out.println("--\tOrdem natural (tempoEpisodio)\t---");
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries3
        ) {
            System.out.println(serie.getNome() +
                    " - " + serie.getGenero() +
                    " - " + serie.getTempoEpisodio());
        }

        System.out.println(" ");
        System.out.println("--\tOrdem Nome/Gênero/TempoEpisódio\t---");
        Set<Serie> minhasSeries4 = new TreeSet<>(new CompareToNomeGeneroTempoEpisodio());
        minhasSeries4.addAll(minhasSeries3);
        for (Serie serie : minhasSeries4
        ) {
            System.out.println(serie.getNome() +
                    " - " + serie.getGenero() +
                    " - " + serie.getTempoEpisodio());
        }
    }
}

