package retorno;

public class Main {
    public static void main(String[] args) {

        double areaTriangulo = Quadrilatero.area(2);
        double areaQuadrado = Quadrilatero.area(2, 3);
        double areaTrapezio = Quadrilatero.area(6, 8, 2);

        System.out.println(areaTriangulo);
        System.out.println(areaQuadrado);
        System.out.println(areaTrapezio);
    }
}
