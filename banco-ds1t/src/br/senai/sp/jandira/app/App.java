package br.senai.sp.jandira.app;

import java.awt.Color;
import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;
import br.senai.sp.jandira.model.Agencia;

public class App {

	public static void main(String[] args) {
				
		//criar o cliente maria
		Cliente clienteMaria = new Cliente();
		clienteMaria.setNome("Maria da Silva");
        clienteMaria.setEmail("maria@terra.com");
        clienteMaria.setSalario(2000);
		
        //criar agencia da maria
        Agencia agencia = new Agencia();
        agencia.setCidade("Ubatuba");
        agencia.setGerente("Carlos Emanuel");
        agencia.setNumero("4214-9");
        agencia.setTelefone("12 8878-9838");
        
        
		// Criação da conta da Maria
		Conta contaMaria = new Conta("7845-8");
		contaMaria.setTitular(clienteMaria); 
		contaMaria.setAgencia(agencia);
		contaMaria.depositar(500);
		contaMaria.setTipo(TipoConta.CORRENTE);
		
		System.out.println("--->" + contaMaria.getTipo());
		
		//criar o cliente Pedro
		Cliente clientePedro = new Cliente();
		clientePedro.setNome("Pedro Cunha");
		clientePedro.setEmail("pedro@ig.com");
		clientePedro.setSalario(1500);
        
		// Criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		contaPedro.setTitular(clientePedro);
		contaPedro.depositar(200);
		contaPedro.setTipo(TipoConta.POUPANCA);
		contaPedro.setAgencia(agencia);
		System.out.println("--->" + contaPedro.getTipo());
		
		//criar o cliente ana
		Cliente clienteAna = new Cliente();
		clientePedro.setNome("Ana Gomes");
		clientePedro.setEmail("ana@zaz.com");
		clientePedro.setSalario(1900);
				
		// Criação da conta da Ana
		Conta contaAna = new Conta("23145-9");
		contaAna.setTitular(clienteAna);
		contaAna.depositar(2000);
		contaAna.setTipo(TipoConta.SALARIO);
		contaAna.setAgencia(agencia);
		System.out.println("--->" + contaAna.getTipo());
		
		
		// Exibir os detalhes das contas
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();
		
		System.out.println();
		System.out.println("===========================");
		System.out.println();
		
		// Depositar 100 Reais na conta da Maria
		contaMaria.depositar(200);
		contaMaria.exibirDetalhes();
		
		System.out.println();
		System.out.println("===========================");
		System.out.println();
		
		// Sacar 100 Reais da conta da Maria
		contaMaria.sacar(300);
		contaMaria.exibirDetalhes();
		
		System.out.println();
		System.out.println("========== TRANSFERINDO ===========");
		System.out.println();
		
		// Transferir 200 Reais da 
		// conta da Maria para a conta do Pedro
		contaMaria.transferir(contaPedro, 2000);
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		
		System.out.println();
		System.out.println("**********************************");
		System.out.println();
		System.out.println(contaMaria.getTitular().getNome());
		System.out.println(contaMaria.getTitular().getEmail());
		System.out.println(contaMaria.getTitular().getSalario());
		
		
	}

}
