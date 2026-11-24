package Lista21;

public class Aluno {
    
	String nome;
	int idade;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome == null || nome.isEmpty()) {
			System.out.println("Nome invalido");
			return;
		}
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
	    if(idade < 0 ) {
	    	System.out.println("Idade invalida");
	    	return;
	    }
	    this.idade = idade;
	}
	
	public void infos() {
		System.out.println("Aluno/a: " + nome);
		System.out.println("Idade: " + idade + " anos");
	}
}
