
public abstract class Conta implements MConta {
	
	protected static final int AGENCIA_PADRAO = 0001;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	private static int SEQUENCIAL = 0;
	
    public Conta() {
    	this.agencia = AGENCIA_PADRAO;
    	this.numero = SEQUENCIAL++;
    }
	
	@Override
	public void sacar (double valor) {
		saldo = saldo - valor;
	}
	@Override
	public void depositar (double valor) {
		saldo = saldo + valor;
		
	}
	@Override
	public void transferir (double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
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
		System.out.println(String.format("Agencia: %d", this.agencia));
		   System.out.println(String.format("Numero: %d", this.numero));
		   System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	
} 
    
	


