package interfaceMap.ExerciciosPropostos.ExercicioProposto03;

import java.util.*;

/*
Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/
public class Main {

    public static void main(String[] args) {

        Map<Integer, Contato> meusContatos = new HashMap<>() {{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
            put(7, new Contato("Luke", 6666));
        }};

        Set<Map.Entry<Integer, Contato>> entries = meusContatos.entrySet();

        System.out.println("\nOrdem aleatória:\n");
        for (Map.Entry<Integer, Contato> entry : entries) {
            System.out.println(
                    "id = " + entry.getKey() + " - " +
                            "Contato = nome: " + entry.getValue().getNome() + ", " +
                            "numero: " + entry.getValue().getNumero()
            );
        }

        Map<Integer, Contato> meusContatos1 = new LinkedHashMap<>() {{
            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
            put(7, new Contato("Luke", 6666));
        }};

        Set<Map.Entry<Integer, Contato>> entries1 = meusContatos1.entrySet();

        System.out.println("\nOrdem de inserção:\n");
        for (Map.Entry<Integer, Contato> entry : entries1) {
            System.out.println(
                    "id = " + entry.getKey() + " - " +
                            "Contato = nome: " + entry.getValue().getNome() + ", " +
                            "numero: " + entry.getValue().getNumero()
            );
        }

        Map<Integer, Contato> meusContatos2 = new TreeMap<>(meusContatos);

        Set<Map.Entry<Integer, Contato>> entries2 = meusContatos2.entrySet();

        System.out.println("\nOrdem de id:\n");
        for (Map.Entry<Integer, Contato> entry : entries2) {
            System.out.println(
                    "id = " + entry.getKey() + " - " +
                            "Contato = nome: " + entry.getValue().getNome() + ", " +
                            "numero: " + entry.getValue().getNumero()
            );
        }

        Set<Map.Entry<Integer, Contato>> entries3 = new TreeSet<>(new ComparatorOrdemNumero());
        entries3.addAll(meusContatos.entrySet());

        System.out.println("\nOrdem de número:\n");
        for (Map.Entry<Integer, Contato> entry : entries3) {
            System.out.println(
                    "id = " + entry.getKey() + " - " +
                            "Contato = nome: " + entry.getValue().getNome() + ", " +
                            "numero: " + entry.getValue().getNumero()
            );
        }

        Set<Map.Entry<Integer, Contato>> entries4 = new TreeSet<>(new ComparatorOrdemContato());
        entries4.addAll(meusContatos.entrySet());

        System.out.println("\nOrdem de contato:\n");
        for (Map.Entry<Integer, Contato> entry : entries4) {
            System.out.println(
                    "id = " + entry.getKey() + " - " +
                            "Contato = nome: " + entry.getValue().getNome() + ", " +
                            "numero: " + entry.getValue().getNumero()
            );
        }

    }
}

