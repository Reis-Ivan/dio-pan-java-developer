package src.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int par = 0, impar = 0, count = 0;
    int numero, nNumeros;

    System.out.println(" ");
    System.out.println("Quantidade de números: ");
    nNumeros = scanner.nextInt();

    while (count < nNumeros) {
      System.out.println("Numero: ");
      numero = scanner.nextInt();

      if (numero % 2 == 0)
        par += 1;
      else
        impar += 1;

      count++;
    }

    scanner.close();
    System.out.println("Quantidade de pares: " + par);
    System.out.println("Quantidade de ímpares: " + impar);
  }
}
