package interfaceSet.ExerciciosPropostos;

import java.sql.Array;
import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class ExercicioProposto01 {
    public static void main(String[] args) {

        Set<String> rainbow = new LinkedHashSet<>();

        rainbow.add("vermelho");
        rainbow.add("laranja");
        rainbow.add("amarelo");
        rainbow.add("verde");
        rainbow.add("azul");
        rainbow.add("anil");
        rainbow.add("violeta");


        System.out.println("\nCores do arco-iris:\n");
        for (String cor : rainbow) {
            System.out.println(cor);
        }

        System.out.println("\nQuantidade de cores: " + rainbow.size());


        Set<String> rainbow_tree = new TreeSet<>(rainbow);

        System.out.println("\nOrdem alfabética:\n");
        for (String cor : rainbow_tree) {
            System.out.println(cor);
        }

        System.out.println("\nExiba as cores na ordem inversa da que foi informada\n");
        List<String> rainbowList = new ArrayList<>(rainbow);
        Collections.reverse(rainbowList);
        System.out.println(rainbowList);

        System.out.println("\nRemova todas as cores que não começam com a letra “v”:\n");
        for (String cor : rainbow) {
            if (cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("\nRemova todas as cores que não começam com a letra “v”:\n");
        Iterator<String> iterator = rainbow.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().startsWith("v")) iterator.remove();
        }
        System.out.println(rainbow);


    }
}
