public class CaixaEletronico {
  public static void main(String[] args){
    ContaCorrente conta = new ContaCorrente(600.00);
    int opcao;
    double valor;
    int parcelas;

    do {
      conta.visualizarOpcoes();
      opcao = Teclado.leInt("Escolha uma opção: ");
      while (opcao < 0 || opcao > 4){
        System.out.println("Opção inválida!");
        opcao = Teclado.leInt("Escolha uma opção: ");
      }
      switch (opcao){
        case 1: 
          valor = Teclado.leDouble("Digite o valor da retirada: ");
          conta.retirada(valor);
          break;
        case 2: 
          valor = Teclado.leDouble("Digite o valor do depósito: ");
          conta.deposito(valor);
          break;
        case 3: 
          valor = Teclado.leDouble("Digite o valor do empréstimo: ");
          parcelas = Teclado.leInt("Digite o número de parcelas: ");
          conta.emprestimo(valor, parcelas);
          break;
        case 4: 
        conta.cosultarSaldo();
          break;
        case 0:
          System.out.println("Caixa eletrônico encerrado.");
          break;
      }
     } while (opcao != 0);
  }
}