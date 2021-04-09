package Semana_6_U;

import java.util.List;
import java.util.Scanner;

import Semana_6.Forma;
import Semana_6_P.Programa;
import Semana_6.Quadrado;
import Semana_6.Triangulo;
import Semana_6.Circulo;

public final class MinhasFormas {
	

	 public static void imprimir(List<Forma> formas) {
		 //percorrer a lista
		 for(Forma forma:formas) {
			 if(forma instanceof Circulo) 
				 System.out.println("Area do Círculo= " + forma.getArea());
			 else if(forma instanceof Quadrado) 
			     System.out.println("Area do Quadrado= " + forma.getArea());
			 else if(forma instanceof Triangulo)
				 System.out.println("Area do triangulo= " + forma.getArea());	 
		 }
		 
	}
	
	/* public static void imprimir(Circulo circulo) {
		 System.out.println("Circulo");
		 System.out.println("Area =" + circulo.getArea());
	 } */

		public static void ler(Forma forma) {
			
			Scanner in = new Scanner(System.in);
			
			if(forma instanceof Circulo){
				System.out.println("Raio:");
				((Circulo) forma).setRaio(in.nextDouble());
			}else if(forma instanceof Quadrado){
				System.out.println("Lado:");
				((Quadrado) forma).setLado(in.nextDouble());
			}else if(forma instanceof Triangulo ){
				System.out.println("Base:");
				((Triangulo) forma).setBase(in.nextDouble());
				System.out.println("Altura:");
				((Triangulo) forma).setAltura(in.nextDouble());
			}
			
	}
}
