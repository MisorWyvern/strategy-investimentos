
public class TesteInvestimentos {
	public static void main(String[] args) {
		ContaCorrente contaTeste = new ContaCorrente("Pedro Investidor", 101, 12345678);
		RealizadorDeInvestimentos terminal = new RealizadorDeInvestimentos();
		
		contaTeste.depositar(10000);
		System.out.println(contaTeste.getSaldo());
		
		terminal.investir(contaTeste, new InvestimentoConservador());
		System.out.println(contaTeste.getSaldo());
		
		terminal.investir(contaTeste, new InvestimentoModerado());
		System.out.printf("Saldo = $ %.2f\n",contaTeste.getSaldo());
		
		terminal.investir(contaTeste, new InvestimentoArrojado());
		System.out.printf("Saldo = $ %.2f\n",contaTeste.getSaldo());
	}
}
