package br.com.fiap.banco;

public class Teste {

	public static void main(String[] args) {
		
		Conta cc = new Conta();
		cc.agencia = 123;
		cc.numero = 321;
		cc.saldo = 50.0;

		cc.depositar(1000);
		
		System.out.println(cc.retornarSaldo());
		
		Conta poupanca = new Conta(231, 12, 200.50);
		poupanca.retirar(10);
		
		System.out.println(poupanca.retornarSaldo());
		
//		Conta errada = null; // Sempre referencia uma variavel de referencia à um objeto
		
	}
	
}
