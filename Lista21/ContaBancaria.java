package Lista21;

public class ContaBancaria {

	private String titular;
	private double saldo = 1000;
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		if(titular == null || titular.isEmpty()) {
			System.out.println("Nome invalido!");
			return;
		}
		this.titular = titular;
		System.out.println("Titular da conta: " + titular + "\n");
	}
	
	public void depositar(double valor) {
		if(valor < 0) {
			System.out.println("Valor de depósito invalido! \n");
			return;
		}
		saldo += valor;
		System.out.println("Foi depositado: R$ " + valor + "\n");
		System.out.println("Saldo atual: R$ " + saldo + "\n");
	}
	
	public void Sacar(double valor) {
		if(valor > saldo) {
			System.out.println("Saque maior que o saldo da conta \n");
			return;
		}
		saldo -= valor;
		System.out.println("Valor sacado: R$ "+ valor + "\n");
		System.out.println("Saldo atual: " + saldo + "\n");
	}
	
	public double getSaldo() {
		return saldo;
	}
	 
}
