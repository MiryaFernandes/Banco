package model;

public class Conta {
	
	//aributos da classe conta 
	public String agencia;
	private double saldo;
	public String tipoConta;
	public String numero;
	public String  titular;
	
	//construtores da classe conta
	public Conta(String numeroConta) {
		
		numero = numeroConta;
		
	}
	
	
	//metodos da classe conta
	public void depositar(double valorDeposito) {
		
		System.out.println();
		System.out.println("Efetuando deposito. . . . . ");
		
		  if (valorDeposito >= 0) {
			  
			  saldo += valorDeposito;
			  System.out.println("Deposito efetuado com sucesso!");
			  
		  } else { 
			  
			  System.out.println("Não foi possivel efetuar o deposito.");
		  
		  }
		
		
	}
	
	public boolean sacar(double valorSaque) {
		
		System.out.println();
		System.out.println("Efetuando saque. . . . . ");
		
		if (valorSaque > saldo || saldo < valorSaque) {
			
			System.out.println("Não foi possivel efetivar o saque.");
			return false;
			
		} else {
			
			saldo -= valorSaque;
			System.out.println("Saque efetivado!");
			return true;
		}
		
		
	}
	
	public void transferir(Conta contaDestino, double valorTransferencia) {
		
		boolean resultado = sacar(valorTransferencia);
		
				if (resultado) {
					
					contaDestino.depositar(valorTransferencia);
					
				} else {
					
					System.out.println("Não foi possivel efetivar o saque.");
					
				}
	}
	
	
	public void exibirDetalhes() {
		
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Agência: %s\n", agencia);
		System.out.printf("Tipo: %s\n", tipoConta);
		System.out.printf("Saldo: %s\n", saldo);
		
	}

}
