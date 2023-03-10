package br.com.fiap.banco;

public class ContaCorrente extends Conta {
	
	private String tipo;
	private double chequeEspecial;
	
	// Metodos Getters e Setters
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	
	// Metodos Gerais
	public double getSaldoDisponivel() {
		return getSaldo() + chequeEspecial;
	}
	

}
