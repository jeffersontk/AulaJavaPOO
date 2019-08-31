//uma classe precisa ter metodos publicos
//e os atributos privados
//criando encapsulamento

public class Conta {

	//Atributos de instancia
	private int  numero;
	private double saldo;
	private boolean ativa;
	
	//construtor customizado	
	/**
	 * constutorr sobrecarregado para criar objetos comuns
	 * @param numero
	 * @param saldo
	 * @param status
	 */
	public Conta(int numero, double saldo, boolean status) {
		this.numero = numero;
		this.saldo = saldo;
		this.ativa = status;
	}
	

	/**
	 * constutorr sobrecarregado para criar objetos Ativos
	 * @param num
	 * @param sal
	 */
	public Conta(int num, double sal ){
		this.numero = num;
		this.saldo = sal;
		this.ativa = true;
	}
	
	//Metodos de acesso
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean isAtiva() {
		return ativa;
	}
	
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	//Metodo de negocio
	public void sacar(double numero) {
		this.saldo -= numero;
	}
	
	public void depositar(double numero) {
		this.saldo += numero;
	}
}
