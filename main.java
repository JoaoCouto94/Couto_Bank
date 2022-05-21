
public class main {
	
	public static void main(String[] args) {
		Cliente couto = new Cliente();
		couto.setNome("Couto");
		
		
		
		Conta cc = new ContaCorrente(couto);
		Conta poupanca = new ContaPoupanca(couto);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
