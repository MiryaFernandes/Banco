package app;

import model.Conta;

public class Banco {

	public static void main(String[] args) {
		
		Conta contaDaMaria = new Conta("7845-5");
		
		contaDaMaria.titular = "Maria Antonieta";
        contaDaMaria.agencia = "5521-7";
        contaDaMaria.tipoConta = "Corrente";
        contaDaMaria.depositar (100.0);
        
        Conta contaDoPedro = new Conta("8945-5");
        
        contaDoPedro.titular = "Pedro cabral";
        contaDoPedro.agencia = "5521-7";
        contaDoPedro.tipoConta = "Poupança";
        contaDoPedro.depositar(2000.0);
        
        
        
        //saldo pedro e maria
        contaDaMaria.exibirDetalhes();
        contaDoPedro.exibirDetalhes();
        
        //depositar 100 reais na conta da maria
        contaDaMaria.depositar(100.0);
        contaDaMaria.exibirDetalhes();
        
        //sacar 300 reais da maria
        contaDaMaria.sacar(300.0);
        contaDaMaria.exibirDetalhes();
        
        //depositar 200 reais na conta do pedro
        contaDoPedro.depositar(-200.0);
        contaDoPedro.exibirDetalhes();
        
        //sacar -100 da conta da maria
        contaDaMaria.sacar(50.0);
        contaDaMaria.exibirDetalhes();
        
        //transferir da conta do pedro para a maria
        
        contaDoPedro.transferir(contaDaMaria,1000.0);
        contaDaMaria.exibirDetalhes();
        
} 
	
}
