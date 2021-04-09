package Semana_6;

public class Quadrado extends Forma {
	
	private Double lado;

	public Quadrado() {
		lado = 0.0;
	}
	
	public Quadrado(Double lado) {
		super();
		this.lado = lado;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return lado*lado;
	}
	public void setLado(Double lado) { //Usado para salvar valores dentro do minhas formas
		this.lado=lado;
	}

}
