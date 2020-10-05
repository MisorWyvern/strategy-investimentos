
public class InvestimentoConservador implements IInvestimento {

	@Override
	public double calcularRetorno(ContaCorrente conta) {
		return conta.getSaldo() * 0.008;
	}
	
}
