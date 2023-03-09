package interfaceList.ExerciciosPropostos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/
public class ExercicioProposto02 {
    public static void main(String[] args) {

        List<String> perguntas = new ArrayList<>();
        List<String> respostas = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        perguntas.forEach(p -> {
            System.out.println(p);
            respostas.add(sc.next());
        });

        int respostasPositivas = 0;


        for (String r : respostas) {
            if (r.equals("sim")) {
                respostasPositivas++;
            }
        }

        if (respostasPositivas == 2) {
            System.out.println("Suspeito");
        } else if (respostasPositivas == 3 || respostasPositivas == 4) {
            System.out.println("Cúmplice");
        } else if (respostasPositivas == 5) {
            System.out.println("Assassino!");
        } else {
            System.out.println("Inocente");
        }


    }
}
