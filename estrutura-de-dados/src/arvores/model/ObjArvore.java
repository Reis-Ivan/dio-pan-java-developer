package src.arvores.model;

public abstract class ObjArvore<T> implements Comparable<T> {

    public abstract boolean equals(Object i);

    public abstract int hashCode();

    public abstract int compareTo(T outro);

    public abstract String toString();
}
