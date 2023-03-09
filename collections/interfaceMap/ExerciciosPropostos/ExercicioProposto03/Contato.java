package interfaceMap.ExerciciosPropostos.ExercicioProposto03;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class Contato {

    String nome;
    Integer numero;

    public Contato(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome) && Objects.equals(numero, contato.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }

}

class ComparatorOrdemNumero implements Comparator<Map.Entry<Integer,Contato>> {
    @Override
    public int compare(Map.Entry<Integer,Contato> c1, Map.Entry<Integer,Contato> c2) {
        return c1.getValue().getNumero().compareTo(c2.getValue().getNumero());
    }
}

class ComparatorOrdemContato implements Comparator<Map.Entry<Integer,Contato>> {
    @Override
    public int compare(Map.Entry<Integer,Contato> c1, Map.Entry<Integer,Contato> c2) {
        return c1.getValue().getNome().compareTo(c2.getValue().getNome());
    }
}