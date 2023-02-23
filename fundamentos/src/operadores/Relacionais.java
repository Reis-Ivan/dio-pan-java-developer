package src.operadores;

public class Relacionais {
  public static void main(String[] args) {

    String nome1 = "Ivan";
    String nome2 = new String("Ivan");

    System.out.println(nome1.equals(nome2));

    int num1 = 1;
    int num2 = 2;

    boolean simNao = num1 == num2;
    System.out.println("num1 é igual a num2? " + simNao);

    simNao = num1 != num2;
    System.out.println("num1 é diferente a num2? " + simNao);

    simNao = num1 > num2;
    System.out.println("num1 é maior a num2? " + simNao);

    simNao = num1 < num2;
    System.out.println("num1 é menor a num2? " + simNao);
  }
}
