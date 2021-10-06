package br.senai.sp.jandira.model;

import br.senai.sp.jandira.lista.TipoConta;

public class Conta {
	
	private TipoConta tipo;
	private String numero;
	private Agencia agencia;
	public Cliente titular;
	private double saldo;
	
	// M�todo construtor
	public Conta(String numeroConta) {
		numero = numeroConta;
	}
	
	public void setTipo(TipoConta tipo){
		
		this.tipo = tipo;
		
	}
	
	public TipoConta getTipo() {
		return tipo;
	}
	
	public void setTitular (Cliente titular) {
		
		this.titular = titular;
		
	}
	
	public Cliente getTitular () {
		
		return titular;
		
	}
	
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public Agencia getAgencia() {
		return agencia;
	}
	
	public void depositar(double valorDeposito) {
		
		if (valorDeposito <= 0) {
			System.out.println("Valor incorreto, n�o foi poss�vel efetuar o dep�sito!");
		} else {
			saldo += valorDeposito;
		}
		
	}
	
	public boolean sacar(double valorSaque) {
		
		if (valorSaque <= 0) {
			System.out.println("Valor incorreto, n�o foi poss�vel efetuar o saque!");
			return false;
		} else if (valorSaque > saldo) {
			System.out.println("Saldo insuficiente!!");
			return false;
		} else {
			saldo -= valorSaque;
			return true;
		}
		
	}
	
	public void transferir(Conta contaDestino, double valorTransferencia) {
		boolean resultado = sacar(valorTransferencia);
		
		if (resultado) {
			contaDestino.depositar(valorTransferencia);
		} else {
			System.out.println("N�o foi poss�vel efetuar a transfer�ncia!");
		}
	
	}
	
	    public void exibirDetalhes() {
	    	
		   System.out.println();
		   System.out.println("---------------------");
	       System.out.printf("Titular: %s\n", titular.getNome());
		   System.out.printf("E-mail: %s\n", titular.getEmail());
		   System.out.printf("N�mero: %s\n", numero);
		   System.out.printf("Ag�ncia: %s\n", agencia.getNumero());
		   System.out.printf("Ag�ncia: %s\n", agencia.getGerente());
		   System.out.printf("Tipo: %s\n", tipo);
		   System.out.printf("Saldo: %s\n", saldo);
	}

	
		
	}
	

