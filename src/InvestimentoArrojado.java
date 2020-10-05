import java.util.Random;

public class InvestimentoArrojado implements IInvestimento {
	private Random RNG;

    public InvestimentoArrojado() {
      RNG = new Random();
    }

	@Override
	public double calcularRetorno(ContaCorrente conta) {
		 	int chanceAleatoria = RNG.nextInt(10) + 1;  //123 456 789 10
	      if(chanceAleatoria >= 1 && chanceAleatoria <= 2) {
	    	  return conta.getSaldo() * 0.05;
	      }
	      else if (chanceAleatoria >= 3 && chanceAleatoria <= 5) {
	    	  return conta.getSaldo() * 0.03;
	      }
	      else {
	    	  return conta.getSaldo() * 0.006;
	      }
	}
	
}