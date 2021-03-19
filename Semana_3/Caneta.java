package Semana_3;

public class Caneta {
// Dica deixa seu codigo salvo no construtor 
	 private String modelo;
	 private String cor; // Somente quem ta dentro da classe caneta pode ver
	
	 
	public Caneta() {
		System.out.println("Criado com sucesso...");
		this.cor = "Azul";
		this.modelo = "Escrita grossa";
	}
	public void imprimir() {
	    System.out.println("Cor = " + this.cor);
	    System.out.println("Modelo = " + this.modelo);
	}
	public void setModelo(String modelo) {
		this.modelo = modelo; //This permite dar o mesmo nome mas joga para o atributo interno
		
	}
	public String getModelo() {
		return this.modelo; 
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

}
