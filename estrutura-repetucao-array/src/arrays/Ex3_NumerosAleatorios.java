package src.arrays;

import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class Ex3_NumerosAleatorios {
  public static void main(String[] args) {
    Random random = new Random();

    int range = 200;

    int[] numerosAleatorios = new int[20];

    for (int i = 0; i < 20; i++) {

      numerosAleatorios[i] = random.nextInt(range);
    }

    System.out.print("\t");
    for (int numero : numerosAleatorios) {
      System.out.print(numero + " ");
    }

    System.out.print("\n\t");
    for (int numero : numerosAleatorios) {
      System.out.print((numero - 1) + " ");
    }

    System.out.print("\n\t");
    for (int numero : numerosAleatorios) {
      System.out.print((numero + 1) + " ");
    }
  }
}
