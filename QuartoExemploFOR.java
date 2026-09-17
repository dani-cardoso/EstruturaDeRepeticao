public class QuartoExemploFOR {
  public static void main(String[] args){
    double valorEmprestimo;
    int parcelas;
    double valorParcela;

    valorEmprestimo = Teclado.leDouble("Digite o valor do empréstimo: ");
    parcelas = Teclado.leInt("Digite o número de parcelas: ");
    for (int i = 1; i <= parcelas; i++){
      valorParcela = (valorEmprestimo / parcelas) * 1.05; //adiciona juros de 5%
      System.out.println("Parcela " + i + ": R$ " + valorParcela);
    }
  }
}