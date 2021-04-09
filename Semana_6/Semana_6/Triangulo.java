package Semana_6;

public class Triangulo extends Forma {

	private Double base;
	private Double altura;
	
	public Triangulo() {
		base=0.0;
		altura=0.0;
	}

	public Triangulo(Double base,Double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (base*altura)/2;
	}
	public void setBase(Double base) { //Usado para salvar valores dentro do minhas formas
		this.base=base;
	}
	public void setAltura(Double altura) { //Usado para salvar valores dentro do minhas formas
		this.altura=altura;
	}

}
