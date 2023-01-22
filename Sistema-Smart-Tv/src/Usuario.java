public class Usuario {
  // Exemplo de uma classe para representar uma SmartTV onde:

  // Ela tenha as características:
  // ligada (boolean),
  // canal (int) e
  // volume (int);
  // Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
  // Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
  // Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número
  // correspondente.

  public static void main(String[] args) throws Exception {

    SmartTv smartTv = new SmartTv();

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.aumentarVolume();

    System.out.println("Qual o canal atual? " + smartTv.canal);

    smartTv.mudarCanal(13);

    System.out.println("Qual o canal atual? " + smartTv.canal);
    System.out.println("Volume Atual: " + smartTv.volume);

    System.out.println("Volume Atual: " + smartTv.volume);

    System.out.println("A TV está ligada? " + smartTv.ligada);

    System.out.println("Qual o volume atual? " + smartTv.volume);

    smartTv.ligar();
    System.out.println("Novo statusTV Ligada?: " + smartTv.ligada);

    smartTv.desligar();
    System.out.println("Novo statusTV Ligada?: " + smartTv.ligada);
  }
}
