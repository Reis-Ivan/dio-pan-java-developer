package src.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numero;
    int maior = 0;
    float soma = 0;
    int count = 0;

    do {
      System.out.println("Número:");
      numero = scanner.nextInt();

      soma += numero;

      if (numero > maior)
        maior = numero;

      count++;
    } while (count < 5);

    scanner.close();
    System.out.println("Maior: " + maior);
    System.out.println("Média: " + (soma / 5));
  }

}
