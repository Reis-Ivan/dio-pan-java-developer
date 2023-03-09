package interfaceSet.ExerciciosPropostos;

import java.util.*;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

public class ExercicioProposto02 {
    public static void main(String[] args) {

        Set<Linguagem> linguagensFavoritas = new LinkedHashSet<>();
        linguagensFavoritas.add(new Linguagem("Java", 1995, "Eclipse"));
        linguagensFavoritas.add(new Linguagem("Python", 1991, "PyCharm"));
        linguagensFavoritas.add(new Linguagem("C#", 2000, "Visual Studio"));
        linguagensFavoritas.add(new Linguagem("PHP", 1995, "PHPStorm"));
        linguagensFavoritas.add(new Linguagem("C++", 1979, "Vim"));

        System.out.println("\nOrdem de inserção:\n");
        for (Linguagem lang : linguagensFavoritas) {
            System.out.println(lang);
        }

        Set<Linguagem> linguagensFavoritas1 = new TreeSet<>(linguagensFavoritas);
        System.out.println("\nOrdem natural (nome):\n");
        for (Linguagem lang : linguagensFavoritas1) {
            System.out.println(lang);
        }

        System.out.println("\nOrdem (IDE):\n");
        Set<Linguagem> linguagensIDE = new TreeSet<>(new ComparatorIDE());
        linguagensIDE.addAll(linguagensFavoritas);
        for (Linguagem lang : linguagensIDE) {
            System.out.println(lang);
        }

        System.out.println("\nOrdem (Ano de criação e nome):\n");
        Set<Linguagem> linguagensAnoNome = new TreeSet<>(new ComparatorAnoCriacaoNome());
        linguagensAnoNome.addAll(linguagensFavoritas);
        for (Linguagem lang : linguagensAnoNome) {
            System.out.println(lang);
        }

        System.out.println("\nOrdem (Nome / Ano / IDE):\n");
        Set<Linguagem> linguagensNomeAnoIDE = new TreeSet<>(new ComparatorNomeAnoIDE());
        linguagensNomeAnoIDE.addAll(linguagensFavoritas);
        for (Linguagem lang : linguagensNomeAnoIDE) {
            System.out.println(lang);
        }


    }
}
