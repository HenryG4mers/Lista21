package Lista21;

public class Produto {

	private String nome;
	private double preco;
	private int estoque;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome == null || nome.isEmpty()) {
	       System.out.println("Nome invalido!");
	       return;
		}	
		this.nome = nome;
		System.out.println("Nome: " + nome);
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		if(preco < 0) {
			System.out.println("Preço Invalido!");
			return;
		}
		this.preco = preco;
		System.out.println("Preço: " +  preco);
	}
	
	public int getEstoque() {
		return estoque;
	}
	
	public void setEstoque(int estoque) {
		if(estoque < 0) {
			System.out.println("Número de estoque invalido!");
			return;
		}
		this.estoque = estoque;
		System.out.println("Estoque: " + estoque);
	}
}
