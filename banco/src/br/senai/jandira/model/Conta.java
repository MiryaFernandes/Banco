package br.senai.jandira.model;

public class Conta {
	
	public String tipo;
	public String numero;
	public String numeroAgencia;
	public String titular;
	public double saldo;                         
	
	public void depositar(double valorDeposito) {
		  
		saldo += valorDeposito;
		
		
		
		
	} 
	
	public void sacar(double valorSaque) {
		
		saldo -= valorSaque;
		
	}
	
	public void transferir() {
		
		
		
	}
	
	public void exibirDetalhes() {
		 
		System.out.println();
		System.out.println("------------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("Numero: %s\n", numero);
		System.out.printf("Agencia: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
		
	}
	
	
			
			

}
