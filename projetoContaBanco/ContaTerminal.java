package projetoContaBanco;

public class ContaTerminal {

	int numero;
	int agencia;
	double saldo;

      
	public ContaTerminal() {	
	}

     
	
	public ContaTerminal(double saldo) {
		this.saldo = saldo;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public int getAgencia() {
		return agencia;
	}



	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
}
