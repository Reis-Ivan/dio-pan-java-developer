package src.implementacoesJava.list;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford")); // 0
        listCarros.add(new Carro("Chevrolet")); // 1
        listCarros.add(new Carro("Fiat")); // 2
        listCarros.add(new Carro("Peugeot")); // 3

        System.out.println(listCarros.contains(new Carro("Ford")));

        System.out.println(listCarros.get(2));

        System.out.println(listCarros.indexOf(new Carro("Fiat")));

        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);

    }
}
