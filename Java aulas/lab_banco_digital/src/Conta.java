

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true; // Saque bem-sucedido
        } 
		else {
            System.out.println("Saldo insuficiente para realizar o saque.");
            return false; // Saque não realizado
        }
	}
	
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		 if (this instanceof ContaCorrente) {
            ContaCorrente cc = (ContaCorrente) this;
            if (saldo + cc.getLimiteAtual() >= valor) {
                saldo -= valor;
                contaDestino.depositar(valor);
            } else {
                System.out.println("Saldo insuficiente para transferência.");
            }
        } else {
            if (saldo >= valor) {
                saldo -= valor;
                contaDestino.depositar(valor);
            } else {
                System.out.println("Saldo insuficiente para transferência.");
            }
        }
    }


	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}