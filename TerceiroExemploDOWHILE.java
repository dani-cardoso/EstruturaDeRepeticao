public class TerceiroExemploDOWHILE {
  public static void main (String[] args){
    double saldo = 500.00;
    double retirada;
    String opcao;

    do{
      retirada = Teclado.leDouble("Digite o valor da retirada: ");
      
      while (retirada > saldo){
        System.out.println("Saldo Insuficiente!");
        retirada = Teclado.leDouble("Digite um novo valor para retirada: ");
      }
      saldo = saldo - retirada;
      System.out.println("Retirada realizada com sucesso!");
      System.out.println("Saldo atual: R$ " + saldo);
      opcao = Teclado.leString("Deseja realizar outra retirada? (s/n): ");
    } while (opcao.equalsIgnoreCase("s"));
    System.out.println("Operação finalizada. Saldo final: R$ " + saldo);
  }
}
