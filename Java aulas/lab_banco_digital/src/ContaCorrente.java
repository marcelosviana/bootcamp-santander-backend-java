import java.util.Locale;
import java.util.Scanner;

public class ContaCorrente extends Conta {
	private static double LIMITE_BASE = 500.0;
	private double limiteAtual;
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		this.limiteAtual = calcularLimite();
	}

	public double getLimiteBase() {
		return LIMITE_BASE;
	}
	public double getLimiteAtual() {
		return limiteAtual;
	}
	private double calcularLimite() {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
            System.out.println("Você tem restrições junto aos orgãos de proteção de credito? ");
            boolean restricao = scanner.nextBoolean();
			
			if (restricao){
				System.out.println("Cliente possui restrições. Limite reduzido a 0.");
				return 0 ;
			}

			else{
				System.out.println("Cliente sem restrições limite liberado: 500 unidades de dinheiro.");
				saldo += LIMITE_BASE;
				return LIMITE_BASE ;
			}

	}


	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
		System.out.println(String.format("Limite Base: %.2f", LIMITE_BASE));
        System.out.println(String.format("Limite Atual: %.2f", limiteAtual));
	}
	
}
