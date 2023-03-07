package br.com.fiap.banco;

public class Conta {
	
	// Protected - Só pode ser acessado caso estiver no mesmo pacote
	// Private - Só pode ser acessado dentro da classe
	// Public - Pode ser acessado de qualquer lugar
	
	protected int agencia;
	int numero; 
	double saldo;
	
	// Construtor Padrão | Sem informações
	public Conta() {
		// APIs experam que toda classe tenha um construtor padrão
	}

	// ALT SHIFT S -> Generate Constructor Using Fields... 
	// Cria-se assim um Construtor de Classe de forma automatica
	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	public void retirar(double valorRetirado) {
		this.saldo -= valorRetirado;
	}
	
	public double retornarSaldo() { 
		return saldo; // Todo metodo que retorna um valor precisa de return
	}
	
}
