package src.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex1_OrdemInversa {
  public static void main(String[] args) {

    int[] arrayNumeros = { 89, -8, 22, 74, 6, 0 };
    int ultimoIndex = arrayNumeros.length - 1;

    for (int i = 0; i <= ultimoIndex; i++) {
      System.out.print(arrayNumeros[i] + " ");
    }

    System.out.println(" ");

    for (int i = ultimoIndex; i >= 0; i--) {
      System.out.print(arrayNumeros[i] + " ");
    }
  }
}
