package interfaceSet;

import java.util.*;

public class ExemploSet_1 {
    public static void main(String[] args) {


        System.out.println("Crie um conjunto e acdicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 7d, 0d, 3.6, 5d));
        System.out.println(notas.toString() + "\n");

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5.0) + "\n");

        System.out.println("Exiba a menor nota: " + Collections.min(notas) + "\n");
        System.out.println("Exiba a maior nota: " + Collections.max(notas) + "\n");

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos valores: " + soma + "\n");

        System.out.println("Exiba a média das notas: " + soma / notas.size() + "\n");

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas + "\n");

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas + "\n");

        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(0d);
        notas2.add(3.6);

        System.out.println("Exiba na ordem de inserção");
        System.out.println(notas2 + "\n");

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3 + "\n");

        System.out.println("Apague todo o conjunto: ");
        notas.clear();
        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto está vazio: " + notas3.isEmpty());


    }

}
