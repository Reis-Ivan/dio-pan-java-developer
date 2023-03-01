package src.filas;

public class Fila<T> {
    private No<T> refNoEntrada;

    public Fila() {
        this.refNoEntrada = null;
    }

    public void enqueue(T obj) {
        No novoNo = new No<>(obj);
        novoNo.setRefNo(refNoEntrada);
        refNoEntrada = novoNo;
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntrada;
            No noAuxiliar = refNoEntrada;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T first() {
        if (!this.isEmpty()) {
            No<T> primeiroNo = refNoEntrada;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty() {
        return this.refNoEntrada == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = this.refNoEntrada;

        if (!this.isEmpty()) {
            while (true) {
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}] ---> ";
                if (noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
