
public class Main {

	public static void main(String[] args) {
		
		Cliente everton = new Cliente();
		everton.setNome("Everton");
		
		Conta cc = new ContaCorrente(everton);
		Conta poupanca = new ContaPoupanca(everton);
		
		cc.depositar(200);
		
		
		cc.pagarBoletos(100);
		poupanca.transferir(100, poupanca);
		poupanca.pagarBoletos(50);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
