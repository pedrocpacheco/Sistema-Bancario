package br.com.fiap.banco;

public class Teste {

	public static void main(String[] args) {
		
		Conta cc = new Conta();
		cc.depositar(123);
		cc.setAgencia(321);
		cc.setNumero(50);

		cc.depositar(1000);
		
		System.out.println(cc.getSaldo());
		
		Conta poupanca = new Conta(231, 12, 200.50);
		poupanca.retirar(10);
		
		System.out.println(poupanca.getSaldo());
		
//		Conta errada = null; // Sempre referencia uma variavel de referencia à um objeto
		
	}
	
}
