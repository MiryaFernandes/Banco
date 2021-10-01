package br.senai.jandira.app;

import br.senai.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		//criação da conta da maria
		Conta contaMaria = new Conta();
		contaMaria.titular = "Maria Antonieta";
		contaMaria.numero = "7585-8";
		contaMaria.numeroAgencia = "4214-9";
		contaMaria.saldo = 500.0;
		contaMaria.tipo = "Corrente";

		//criação da conta do pedro
		Conta contaPedro = new Conta();
		contaPedro.titular = "Pedro Carlos";
		contaPedro.numero = "6547-6";
		contaPedro.numeroAgencia = "4214-9";
		contaPedro.saldo = 200.0;
		contaPedro.tipo = "Poupança";
contaPedro.exibirDetalhes();
		//exibir os detalhes das contas
		
		System.out.println();
		contaMaria.exibirDetalhes();
		
	}

}
