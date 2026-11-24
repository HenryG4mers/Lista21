package Lista21;

public class Avaliacao {

		private String nome;
		private double nota1;
		private double nota2;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			if(nome == null || nome.isEmpty()) {
				System.out.println("Nome invalido!");
				return;
			}
			this.nome = nome;
			System.out.println("Nome: "+ nome + "\n");
		}
		public double getNota1() {
			return nota1;
		}
		public void setNota1(double nota1) {
			if(nota1 < 0 || nota1 > 10) {
				System.out.println("Nota invalida!");
				return;
			}
			this.nota1 = nota1;
			System.out.println("Primeira nota: " + nota1);
		}
		public double getNota2() {
			return nota2;
		}
		public void setNota2(double nota2) {
			if(nota2 < 0 || nota2 > 10) {
				System.out.println("Nota invalida!");
				return;
			}
			this.nota2 = nota2;
			System.out.println("Segunda nota: " + nota2);
			
		}
		
		public void media() {
			double media = (nota1 + nota2) / 2;
			System.out.println("Média das notas = " + media);
		}
		
	}

