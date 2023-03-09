package interfaceList;

import java.util.*;

/**
 * Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6]
 */

public class ExemploList_1 {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<Double>(); // Criando uma lista

        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas + "\n");

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d) + "\n");

        System.out.println("Adicione na lista anota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas + "\n");

        System.out.println("Substitua a nota 5.0 pela nota 6.0");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas + "\n");

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d) + "\n");

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");

        for (Double nota: notas) {
            System.out.println("Indice " + notas.indexOf(nota) + " - " + nota);
        }

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2) + "\n");

        System.out.println("Exiba a menor nota: " + Collections.min(notas) + "\n");

        System.out.println("Exiba a maior nota: " + Collections.max(notas) + "\n");

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a soma dos valores: " + soma + "\n");

        System.out.println("Exiba a média das notas: " + soma / notas.size() + "\n");

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas + "\n");

        System.out.println("Remova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas + "\n");

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        notas.removeIf(next -> next < 7);
        System.out.println(notas + "\n");

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas + "\n");

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty()+ "\n");


    }
}
