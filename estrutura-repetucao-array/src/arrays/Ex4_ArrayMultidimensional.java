package src.arrays;

import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/
public class Ex4_ArrayMultidimensional {
  public static void main(String[] args) {
    Random rnd = new Random();

    int[][] matrix = new int[4][4];

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        matrix[i][j] = rnd.nextInt(10);
      }
    }

    System.out.print("Matriz gerada: ");
    for (int[] linha : matrix) {
      System.out.println(" ");
      for (int coluna : linha) {
        System.out.print(coluna + "\t");
      }
    }
  }
}
