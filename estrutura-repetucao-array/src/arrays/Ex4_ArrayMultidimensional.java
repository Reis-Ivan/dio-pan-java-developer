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
        matrix[i][j] = rnd.nextInt(20);
      }
    }

    for (int i = 0; i < 4; i++) {
      System.out.println(" ");
      for (int j = 0; j < 4; j++) {
        System.out.print(matrix[i][j] + " ");
      }
    }
  }
}
