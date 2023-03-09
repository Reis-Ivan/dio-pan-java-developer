package interfaceSet.ExerciciosPropostos;

import java.util.Comparator;

public class Linguagem implements Comparable<Linguagem> {

    String nome;
    Integer anoCriacao;
    String IDE;

    public Linguagem(String nome, Integer anoCriacao, String IDE) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.IDE = IDE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIDE() {
        return IDE;
    }

    public void setIDE(String IDE) {
        this.IDE = IDE;
    }

    public Integer getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(Integer anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    @Override
    public String toString() {
        return this.getNome() + " - " + this.getAnoCriacao() + " - " + this.getIDE();
    }

    @Override
    public int compareTo(Linguagem linguagem) {
        return this.getNome().compareToIgnoreCase(linguagem.getNome());
    }
}

class ComparatorIDE implements Comparator<Linguagem> {
    @Override
    public int compare(Linguagem l1, Linguagem l2) {
        return l1.getIDE().compareToIgnoreCase(l2.getIDE());
    }
}

class ComparatorAnoCriacaoNome implements Comparator<Linguagem> {
    @Override
    public int compare(Linguagem l1, Linguagem l2) {
        int anoCriacao = l1.getAnoCriacao().compareTo(l2.getAnoCriacao());
        if (anoCriacao != 0) return anoCriacao;

        return l1.getNome().compareToIgnoreCase(l2.getNome());
    }
}

class ComparatorNomeAnoIDE implements Comparator<Linguagem> {
    @Override
    public int compare(Linguagem l1, Linguagem l2) {
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        if (nome != 0) return nome;

        int anoCriacao = l2.getAnoCriacao().compareTo(l2.getAnoCriacao());
        if (anoCriacao != 0) return anoCriacao;

        return l1.getIDE().compareToIgnoreCase(l2.getIDE());
    }
}
