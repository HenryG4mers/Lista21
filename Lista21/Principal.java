package Lista21;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno al = new Aluno();
		al.setNome("Breno");
		al.setIdade(16);
		al.infos();
		System.out.println("---------------------------");
	
		
		Produto p = new Produto();
		p.setNome("Maça");
		p.setPreco(3.43);
		p.setEstoque(167);
		System.out.println("-------------------------");
		
		Produto p2 = new Produto();
		p2.setNome("Doritos");
		p2.setEstoque(30);
		p2.setPreco(14.99);
		System.out.println("-----------------------");
		
		ContaBancaria conta = new ContaBancaria();
		conta.setTitular("Henry");
		conta.depositar(50);
		conta.Sacar(50);
		System.out.println("-----------------------");
		
		Avaliacao av = new Avaliacao();
		av.setNome("Ali Lasanha");
		av.setNota1(8);
		av.setNota2(10);
		av.media();
		System.out.println("-----------------------");
		
		Carro car = new Carro();
		car.setModelo("Gol quadrado");
		car.setAno(2007);
		car.setVelocidadeAtual(100);
		car.acelerar(20);
		car.frear(60);
		System.out.println("-----------------------");
		
		Retangulo re = new Retangulo();
      
		re.setAltura(40);
		re.setLargura(20);
		re.perimetroRetangulo();
		re.areaRetangulo();
		
	}

}
