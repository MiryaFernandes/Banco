package app;

import model.Conta;

public class Banco {

	public static void main(String[] args) {
		
		Conta contaDaMaria = new Conta();
		
		contaDaMaria.titular = "Maria Antonieta";
        contaDaMaria.agencia = "5521-7";
        contaDaMaria.numero = "7845-5";
        contaDaMaria.tipoConta = "Corrente";
        contaDaMaria.saldo = 1000;
        
        Conta contaDoPedro = new Conta();
        
        contaDoPedro.titular = "Pedro cabral";
        contaDoPedro.agencia = "5521-7";
        contaDoPedro.numero = "8945-5";
        contaDoPedro.tipoConta = "Poupança";
        contaDoPedro.saldo = 500;
        
        
        //saldo pedro e maria
        System.out.println("O saldo de maria é: " + (contaDaMaria.saldo));
        System.out.println("O saldo de pedro é: " + (contaDoPedro.saldo));
        
        //depositar 100 reais na conta da maria
        contaDaMaria.depositar(100);
        
        System.out.println("O saldo de maria é: " + (contaDaMaria.saldo));
        
	
	    contaDoPedro.depositar(50);
    
        System.out.println("O saldo de pedro é: " + (contaDoPedro.saldo));{
        	
        	
        
}

} 
	
}
