import java.util.Random;

public class InvestimentoModerado implements IInvestimento {
	private Random RNG;
	
	public InvestimentoModerado() {
		RNG = new Random();
	}

	@Override
	public double calcularRetorno(ContaCorrente conta) {
		//0 ou 1 ou seja 50%
		if(RNG.nextInt(2) == 0) return conta.getSaldo() * 0.025;
		
		return conta.getSaldo() * 0.007;
	}
	
}