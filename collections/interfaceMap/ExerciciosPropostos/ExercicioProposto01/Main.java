package interfaceMap.ExerciciosPropostos.ExercicioProposto01;

import java.util.*;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */
public class Main {
    public static void main(String[] args) {

        Map<String, Integer> estadosNordeste = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 9351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println("\nEstado em ordem inserção: \n");
        Map<String, Integer> estadosNordesteLinked = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 9351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        for (Map.Entry<String, Integer> estados : estadosNordesteLinked.entrySet()) {
            System.out.println(estados.getKey() + " - " + "Pop: " + estados.getValue());
        }

        System.out.println("\nSubstitua a população do estado de RN por 3.534.165\n");
        estadosNordeste.put("RN", 3534165);
        for (Map.Entry<String, Integer> estados : estadosNordeste.entrySet()) {
            System.out.println(estados.getKey() + " - " + "Pop: " + estados.getValue());
        }

        System.out.println("\nConfira se o estado PB está no dicionário:\n");
        if (!estadosNordeste.containsKey("PB")) {
            System.out.println("PB não está.\n");
            estadosNordeste.put("PB", 4039277);
        }
        for (Map.Entry<String, Integer> estados : estadosNordeste.entrySet()) {
            System.out.println(estados.getKey() + " - " + "Pop: " + estados.getValue());
        }

        Map<String, Integer> estadosNordesteTree = new TreeMap<>(estadosNordeste);
        System.out.println("\nEstado em ordem alfabética: \n");
        for (Map.Entry<String, Integer> estados : estadosNordesteTree.entrySet()) {
            System.out.println(estados.getKey() + " - " + "Pop: " + estados.getValue());
        }

        Integer estadoMenorPopulacao = Collections.min(estadosNordeste.values());
        Integer estadoMaiorPopulacao = Collections.max(estadosNordeste.values());

        System.out.println("\nExiba o estado com menor população: ");
        for (Map.Entry<String, Integer> estado : estadosNordeste.entrySet()) {
            if (estado.getValue().equals(estadoMenorPopulacao)) {
                System.out.println(estado.getKey() + " - " + estado.getValue());
            }
        }

        System.out.println("\nExiba o estado com maior população: ");
        for (Map.Entry<String, Integer> estado : estadosNordeste.entrySet()) {
            if (estado.getValue().equals(estadoMaiorPopulacao)) {
                System.out.println(estado.getKey() + " - " + estado.getValue());
            }
        }

        Double soma = 0d;
        for (Map.Entry<String, Integer> estado : estadosNordeste.entrySet()) {
            soma += estado.getValue();
        }
        System.out.println("\nExiba a soma da população: ");
        System.out.println(soma);

        System.out.println("\nExiba a soma da população: ");
        System.out.println(soma / estadosNordeste.size());

        System.out.println("\nRemova os estados com população menor que 4.000.000: ");
        estadosNordeste.values().removeIf(integer -> integer <= 4000000);
        for (Map.Entry<String, Integer> estados : estadosNordeste.entrySet()) {
            System.out.println(estados.getKey() + " - " + "Pop: " + estados.getValue());
        }

        estadosNordeste.clear();
        System.out.println("\nConfira se o dicionário está vazio: " + estadosNordeste.isEmpty());

    }
}
