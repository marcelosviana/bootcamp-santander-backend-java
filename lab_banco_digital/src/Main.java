import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		   Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
            System.out.println("Digite seu nome ");
            String nomeCliente = scanner.nextLine();

			Cliente ingressante = new Cliente();
			ingressante.setNome(nomeCliente);
	
		Conta cc = new ContaCorrente(ingressante);
		Conta poupanca = new ContaPoupanca(ingressante);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc.sacar(300);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}