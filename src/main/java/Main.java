
public class Main {

	public static void main(String[] args) {
		
		Cliente anderson = new Cliente();
		anderson.setNome("Anderson");
		
		Conta cc = new ContaCorrente(anderson);
		Conta poupanca = new ContaPoupanca(anderson);
		
		cc.depositar(200);
		
		
		cc.pagarBoletos(100);
		poupanca.transferir(100, poupanca);
		poupanca.pagarBoletos(50);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
