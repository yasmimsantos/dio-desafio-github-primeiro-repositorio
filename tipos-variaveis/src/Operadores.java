public class Operadores {
  public static void main(String[] args) {
    // **Atribuição

    String nome = "YASMIM";
    int idade = 29;
    double altura = 1.72;
    char sexo = 'F';
    boolean gostaDeEstudar = true;

    // *Aritméticos
    // concatenação de String
    String nomeCompleto = "LINGUAGEM " + "JAVA";

    System.out.println(nomeCompleto);

    // dependendo da organização dos elementos, tem-se umr resultado diferente
    String concatenacao = "?";
    System.out.println(concatenacao);
    concatenacao = 1 + 1 + 1 + "1";
    System.out.println(concatenacao);
    concatenacao = 1 + "1" + 1 + 1;
    System.out.println(concatenacao);
    concatenacao = 1 + "1" + 1 + "1";
    System.out.println(concatenacao);
    concatenacao = "1" + 1 + 1 + 1;
    System.out.println(concatenacao);
    concatenacao = "1" + (1 + 1 + 1);

    // **Unários : Esses operadores, são aplicados juntamente com um outro operador
    // aritmético.
    // Eles realizam alguns trabalhos básicos como incrementar, decrementar,
    // inverter valores numéricos e booleanos.
    int numero = 5;

    // Imprimindo o numero negativo
    System.out.println(-numero);

    // incrementando numero em mais 1 numero, imprime 6
    // MESMA COISA DE numero +1
    numero++;
    System.out.println(numero);

    // incrementando numero em mais 1 numero, imprime 7
    System.out.println(++numero);

    // ordem de precedencia conta aqui
    System.out.println(++numero);

    boolean verdadeiro = true;
    // inverte o valor de uma variavel booleana
    System.out.println("Inverteu " + !verdadeiro);

    // **Ternário: <Expressão Condicional> ? <Caso condição seja true> : <Caso
    // condição seja false>

    int a, b;

    a = 5;
    b = 6;

    /*
     * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
     * if(a==b)
     * resultado = "verdadeiro";
     * else
     * resultado = "falso";
     */

    // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
    String resultado = (a == b) ? "verdadeiro" : "falso";

    System.out.println(resultado);

    // **Relacionais
    // == Quando desejamos verificar se uma variável é IGUAL A outra.
    // != Quando desejamos verificar se uma variável é DIFERENTE da outra.
    // > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
    // >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
    // < Quando desejamos verificar se uma variável é MENOR QUE outra.
    // <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
    int numero1 = 1;
    int numero2 = 2;

    if (numero1 > numero2)
      System.out.print("Numero 1 é maior que numero 2.");

    if (numero1 < numero2)
      System.out.print("Numero é 1 menor que numero 2.");

    if (numero1 >= numero2)
      System.out.print("Numero 1 é maior ou igual que numero 2.");

    if (numero1 <= numero2)
      System.out.print("Numero 1 é menor ou igual que numero 2.");

    if (numero1 != numero2)
      System.out.print("Numero 1 é diferente de numero 2.");

    // Comparações avançadas
    int numero3 = 130;
    int numero4 = 130;
    System.out.println(numero3 == numero4); // true

    Integer numero30 = 130;
    Integer numero40 = 130;

    System.out.println(numero1 == numero2); // false

    // A razão pela qual o resultado é false, é devido o Java tratar os valores
    // Como objetos a partir de agora.
    // Qual a solução ?
    // Quando queremos comparar objetos, usamos o método equals

    System.out.println(numero30.equals(numero40));

    // * Lógicos:
    // && Operador Lógico "E"
    // || Operador Lógico "OU"

    boolean condicao1 = true;

    boolean condicao2 = false;

    /*
     * Aqui estamos utilizando o operador lógico E para fazer a união de duas
     * expressões.
     * É como se estivesse escrito:
     * "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
     */

    if (condicao1 && condicao2)
      System.out.print("Os dois valores precisam ser verdadeiros");

    // Se condicao1 OU condicao2 for verdadeira, executar código.
    if (condicao1 || condicao2)
      System.out.print("Um dos valores precisa ser verdadeiro");

  }
}
