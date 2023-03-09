package streamsAPI.ExerciciosStreamAPI;

import java.util.*;
import java.util.stream.Collectors;


public class ExercicioStreamAPI {
    public static void main(String[] args) {

        List<String> numeroAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String:\n");
        numeroAleatorios.forEach(System.out::println);

        System.out.println("\nPegue os 5 primeiros números e coloque dentro de um Set:\n");
        Set<String> setPrimeirosCinco = numeroAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());


        System.out.println("\nTransforme esta lista de String em uma lista de números inteiro:");
        List<Integer> integerList = numeroAleatorios.stream()
                .map(Integer::parseInt)
                .toList();

        System.out.println("\nPegue os numeros pares e maiores que 2 e coloque em uma lista:");
        List<Integer> listaParesMaiorQueDois = numeroAleatorios.stream()
                .map(Integer::parseInt)
                .filter(integer -> integer % 2 == 0 && integer > 2)
                .toList();

        System.out.println("\nMostre a média dos números:");
        numeroAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("\nRemova os valores ímpares:");
        List<Integer> integerList2 = new ArrayList<>(numeroAleatorios.stream()
                .map(Integer::parseInt)
                .toList());

        integerList2.removeIf(integer -> (integer % 2 != 0));
        System.out.println(integerList2);
    }
}
