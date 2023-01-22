public class Aula1_Main {
    public static void main(String[] args) {
        // Calculadora
        System.out.println("Exercício Calculadora");
        Aula1_Calculadora.soma(3, 6);
        Aula1_Calculadora.subtracao(9, 1.8);
        Aula1_Calculadora.multiplicacao(7, 8);
        Aula1_Calculadora.divisao(100, 2);

        // Mensagem
        System.out.println("Exercício Mensagem");
        Aula1_Mensagem.obterMensagem(9);
        Aula1_Mensagem.obterMensagem(14);
        Aula1_Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("Exercício Empréstimo");
        Aula1_Emprestimo.calcular(1000, Aula1_Emprestimo.getDuasParcelas());
        Aula1_Emprestimo.calcular(1000, Aula1_Emprestimo.getTresParcelas());
        Aula1_Emprestimo.calcular(1000, 5);
    }
}
