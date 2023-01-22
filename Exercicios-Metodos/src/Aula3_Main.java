public class Aula3_Main {

    public static void main(String[] args) {

        // Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = Aula3_Quadrilatero.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Aula3_Quadrilatero.area(5, 5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = Aula3_Quadrilatero.area(7, 8, 9);
        System.out.println("Área do trapézio:" + areaTrapezio);

    }
}
