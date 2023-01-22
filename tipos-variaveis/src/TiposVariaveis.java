public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Os oito tipos primitivos em Java são:
        // int, byte, short, long, float, double, boolean e char – esses tipos não são
        // considerados objetos e portanto representam valores brutos. Eles são
        // armazenados diretamente na pilha de memória. (Memory stack)

        // **Modelo: <Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>

        int idade; // Tipo "int", nome "idade", com nenhum valor atribuído.
        int anoFabricacao = 2021; // tipo "int", nome "anoFabricacao", com valor 2021.
        double salarioMinimo = 2.500; // tipo "double", nome "salarioMinimo", valor 2.500.

        // tipo de variável que pode mudar
        int numero_que_pode_mudar = 1;
        numero_que_pode_mudar = 2;

        System.out.print(numero_que_pode_mudar);

        // quando se quer criar uma constante que nao pode mudar, usa-se o tipo "final"
        // e por convenção o nome da variável é escrito em caixa alta
        final double VALOR_DE_PI = 3.14;

    }
}
