public class ContaCorrente{
  private double saldo;
  public ContaCorrente(double saldo){
    this.saldo = saldo;
  }
  public void retirada(double valor){
    while (valor > saldo){
      System.out.println("Saldo Insuficiente!");
      valor = Teclado.leDouble("Digite um novo valor para retirada: ");
    }
    saldo = saldo - valor;
    System.out.println("Retirada realizada com sucesso!");
  }
  public void deposito(double valor){
    while (valor <= 0){
      System.out.println("Valor deve ser maior que zero!");
      valor = Teclado.leDouble("Digite um novo valor para depósito: ");
    }
    saldo = saldo + valor;
    System.out.println("Depósito realizado com sucesso!");
  }
  public void emprestimo(double valor, int parcelas){
    while (parcelas <=0){
      System.out.println("Número de parcelas deve ser maior que zero!");
      parcelas = Teclado.leInt("Digite um novo número de parcelas: ");
    }
    double valorParcela;
    for (int i = 1; i <= parcelas; i++){
      valorParcela = (valor / parcelas) * 1.05; //adiciona juros de 5%
      System.out.println("Parcela " + i + ": R$ " + valorParcela);
    }
  }
  public void cosultarSaldo(){
    System.out.println("Saldo atual: R$ " + saldo);
  }
  public void visualizarOpcoes(){
    System.out.println("Escolha uma opção:");
    System.out.println("1 - Retirada");
    System.out.println("2 - Depósito");
    System.out.println("3 - Empréstimo");
    System.out.println("4 - Consultar Saldo");
    System.out.println("0 - Sair");
  }
}