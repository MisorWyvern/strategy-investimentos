
public class RealizadorDeInvestimentos {
	public void investir(ContaCorrente conta, IInvestimento investimento) {
        double resultado = investimento.calcularRetorno(conta);

        conta.depositar( resultado * 0.75 );
        System.out.println ("Novo saldo: " + conta.getSaldo());
      }
}
