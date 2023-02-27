package src.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex6_Fatorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Número:");
    int numero = sc.nextInt();
    sc.close();
    int fatorial = 1;

    // while (numero > 0) {
    // fatorial = fatorial * numero;
    // numero--;
    // }

    for (int i = numero; i >= 1; i--) {
      fatorial *= i;
    }

    System.out.println("Fatorial = " + fatorial);
  }
}
