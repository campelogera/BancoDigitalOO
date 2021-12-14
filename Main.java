package entities;

public class Main {

	public static void main(String[] args) {
		Cliente Geraldo = new Cliente();
		Geraldo.setNome("Geraldo");
		
		IConta cc = new ContaCorrente(Geraldo);
		IConta poupanca = new ContaPoupanca(Geraldo);
		
		cc.depositar(100);
		
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
