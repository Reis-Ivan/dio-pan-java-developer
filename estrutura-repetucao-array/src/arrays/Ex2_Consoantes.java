package src.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

public class Ex2_Consoantes {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String[] vetor = new String[6];
    String[] vogais = { "a", "e", "i", "o", "u" };
    int count = 0;

    for (int i = 0; i < 6; i++) {
      vetor[i] = scanner.next();
    }
    scanner.close();

    System.out.print("Consoantes: ");
    for (String letra : vetor) {
      if (!Arrays.asList(vogais).contains(letra.toLowerCase())) {
        System.out.print(letra + " ");
        count++;
      }
    }
    System.out.println("Número de consoantes: " + count);
  }
}
