package src;

import java.util.Scanner;

/**
 *
 */

public class ControleFluxoDecisao {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double sideA = scanner.nextDouble();
    double sideB = scanner.nextDouble();
    double sideC = scanner.nextDouble();

    scanner.close();

    boolean notTriangle = sideA >= (sideB + sideC);
    boolean trianguloRetangulo = (sideA * sideA) == (sideB * sideB) + (sideC * sideC);
    boolean trianguloObtusangulo = (sideA * sideA) > (sideB * sideB) + (sideC * sideC);
    boolean trianguloAcutangulo = (sideA * sideA) < (sideB * sideB) + (sideC * sideC);

    if (notTriangle) {
      System.out.println("NAO FORMA TRIANGLO");
    } else if (trianguloRetangulo) {
      System.out.println("TRIANGULO RETANGULO");
    } else if (trianguloObtusangulo) {
      System.out.println("TRIANGULO OBTUSANGULO");
    } else if (trianguloAcutangulo) {
      System.out.println("TRIANGULO ACUTANGULO");
    }

    int numeroDeLados = contaLadosIguais(sideA, sideB, sideC);

    switch (numeroDeLados) {
      case 3:
        System.out.println("TRIANGULO EQUILATERO");
        break;
      case 2:
        System.out.println("TRIANGULO ISOSCELES");
        break;
      default:
        break;
    }

  }

  private static int contaLadosIguais(double x, double y, double z) {
    int ladosIguais = 0;

    if (x == y && y == z) {
      ladosIguais = 3;
    } else if ((x == y && x != z) || (x != y && y == z) || (x != y && x == z)) {
      ladosIguais = 2;
    }
    return ladosIguais;
  }

}
