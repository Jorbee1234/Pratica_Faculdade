package Semana_3;
public class TesterCaneta {
   public static void main (String[] args) {
	   
	   Caneta caneta = new Caneta();
	   
	   //caneta.cor = "azul";
	   
	   //caneta.modelo = "Escrita fina";
	   
	  
	   caneta.setModelo("Escrita fina");
	   caneta.setCor("Verde");
	   caneta.imprimir();
	   
	   System.out.println("Usuario Modelo" + caneta.getModelo());
   }
}
