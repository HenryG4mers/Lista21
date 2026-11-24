package Lista21;

public class Retangulo {
	
	private double largura;
	private double altura;
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		if(altura < 0) {
			System.out.println("Valor invalido");
		}
		this.altura = altura;
		System.out.println("Altura: "+ altura);
	}
	
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		if(largura < 0) {
			System.out.println("Valor invalido");
		}
		this.largura = largura;
		System.out.println("Largura: "+ largura);
	}
	
	public void areaRetangulo() {
		double area = altura * largura;
		System.out.println("Área do retângulo: "+ area);
	}
	
	public void perimetroRetangulo() {
		double perimetro = (altura * 2) + (largura * 2);
		System.out.println("Perímetro do retângulo: "+ perimetro);
	}
}
