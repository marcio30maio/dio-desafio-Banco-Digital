public class Main {

public static void main(String[] args) {
	Cliente Marcio = new Cliente();
	Marcio.setNome("Marcio");
	
	Conta cc = new ContaCorrente(Marcio);
	Conta poupanca = new ContaPoupanca(Marcio);

	cc.depositar(500);
	cc.transferir(100, poupanca);
	
	cc.imprimirExtrato();
	poupanca.imprimirExtrato();
}

} 