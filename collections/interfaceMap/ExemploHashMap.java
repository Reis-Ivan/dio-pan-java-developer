package interfaceMap;

import java.sql.SQLOutput;
import java.util.*;

public class ExemploHashMap {
    public static void main(String[] args) {

        Map<String, Double> carrosPopulares = new HashMap<>();

        carrosPopulares.put("gol", 14.4);
        carrosPopulares.put("uno", 15.6);
        carrosPopulares.put("mobi", 16.1);
        carrosPopulares.put("hb20", 14.5);
        carrosPopulares.put("kwid", 15.6);

        System.out.println("Exiba o Map:");
        System.out.println(carrosPopulares);

        System.out.println("\nSubstitua o consumo do gol por 15.2 km/l:");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("\nConfira se o modelo tucson está no dicionário:");
        System.out.println(carrosPopulares.containsKey("tucson"));

        System.out.println("\nExiba o consumo do uno:");
        System.out.println(carrosPopulares.get("uno"));

        System.out.println("\nExiba os modelos:");
        System.out.println(carrosPopulares.keySet());

        System.out.println("\nExiba os consumo dos carros:");
        System.out.println(carrosPopulares.values());

        System.out.println("\nExiba o consumo mais econômico:");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        System.out.println(consumoMaisEficiente);

        System.out.println("\nExiba o modelo mais enficiente:");
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("\nExiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        Double soma = 0d;
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            soma += entry.getValue();
        }

        System.out.println("\nExiba a soma dos consumos: " + soma + "km/l");

        System.out.println("\nExiba a media dos consumos: " + soma/carrosPopulares.size() + " km/l");

        System.out.println("\nRemova os modelos com consumo igual a 15.6 km/l:");

        carrosPopulares.values().removeIf(aDouble -> aDouble.equals(15.6));

        System.out.println(carrosPopulares);

        System.out.println("\nExiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopularesLinkedHashMap = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopularesLinkedHashMap);

        System.out.println("\nExiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopularesTree = new TreeMap<>(carrosPopularesLinkedHashMap);
        System.out.println(carrosPopularesTree);

        System.out.println("\nApague o dicionário de carros: ");
        carrosPopulares.clear();

        System.out.println("\nConfira se o dicionário está vazio: " + carrosPopulares.isEmpty());



    }
}
