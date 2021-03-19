package Semana_4;

public class BMW extends Carro{
private String velocidade;


public String getVelocidade() {
	return velocidade;
}

public void setVelocidade(String velocidade) {
	this.velocidade = velocidade;
}
public void imprimir() {
	System.out.println("Cor: " + getCor());
	System.out.println("Velocidade: " + this.velocidade);
	System.out.println("Lugares: " + getNum_acent());
	
}

}
