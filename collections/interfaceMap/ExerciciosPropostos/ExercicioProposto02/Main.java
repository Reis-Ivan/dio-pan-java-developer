package interfaceMap.ExerciciosPropostos.ExercicioProposto02;

import java.util.*;

/*
Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi conseguido.
 */

public class Main {
    public static void main(String[] args) {

        Map<Integer, Integer> resultado = new HashMap<>(){{
            put(1,0);
            put(2,0);
            put(3,0);
            put(4,0);
            put(5,0);
            put(6,0);
        }};

        Set<Map.Entry<Integer, Integer>> entries = resultado.entrySet();

        for (int i = 0; i < 100; i++) {

            Integer dado = (int) ((Math.random() * 6) + 1);

            for (Map.Entry<Integer, Integer> entry : entries) {
                if(entry.getKey().equals(dado)) {
                    int aux = entry.getValue();
                    aux++;
                    resultado.put(entry.getKey(),aux);
                }
            }

        }

        System.out.println(resultado);
    }
}
