package Semana_6;

public class Circulo extends Forma {

	private Double raio;
	
	public Circulo() {
		raio = 0.0;
	}
	
	public Circulo(Double raio) {
		super();
		this.raio = raio;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*raio*raio;
	}
	public void setRaio(Double raio) { //Usado para salvar valores dentro do minhas formas
		this.raio=raio;
	}

}
