
public class ContaCorrente {
	private double saldo;
	private int numeroAgencia;
	private int numeroConta;
	private String titular;
	
	public ContaCorrente(String titular, int numeroAgencia, int numeroConta) {
		saldo = 0;
		setTitular(titular);
		setNumeroAgencia(numeroAgencia);
		setNumeroConta(numeroConta);
	}
	
	public double getSaldo() {
		return saldo;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}
	
	private void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	
	private void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}
	
	private void setTitular(String titular) {
		this.titular = titular;
	}
	
	//Movimentacoes do Saldo
	public boolean depositar(double valor) {
		if(saldo < 0) {
			return false;
		}
		
		this.saldo += valor;
		return true;
	}
	
	public boolean sacar(double valor) {
		if(!(valor <= saldo) || valor < 0) {
			return false;
		}
		
		saldo -= valor;
		return true;
	}
	
	public boolean transferir(double valor, ContaCorrente conta) {
		if(!(valor <= saldo) || valor < 0) {
			return false;
		}
		
		conta.saldo += valor;
		saldo -= valor;
		return true;
	}
	
	
}
