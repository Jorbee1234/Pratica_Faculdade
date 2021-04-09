package Semana_6_P;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Semana_6.Circulo;
import Semana_6.Forma;
import Semana_6.Quadrado; //Pode ser feito assim: import Semana_6.*;
import Semana_6_U.MinhasFormas;
import Semana_6.Triangulo;

public class Programa {
     
	

	public static void main(String[] agrs) {
		
		/*Double raio;
		Double lado;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Entre com o valor do raio:");
		raio = in.nextDouble();*/
		
		Circulo circulo = new Circulo();
		Quadrado quadrado = new Quadrado();
		Triangulo triangulo = new Triangulo();
		MinhasFormas.ler(circulo);
		MinhasFormas.ler(quadrado);
		MinhasFormas.ler(triangulo);
		
		/*System.out.println("Entre com o valor do lado do quadro:");
		lado = in.nextDouble();*/
		
	    
		
		
		
		//System.out.println("Area do circulo= " + circulo.getArea());
		//System.out.println("Area do quadrado= " + quadrado.getArea());
		
		List<Forma> formas = new ArrayList<>();
		
		formas.add(circulo);
		formas.add(quadrado);
		formas.add(triangulo);
		
		// Percorrer a lista
		/*for(Forma forma : formas) {
			System.out.println("Area= " + forma.getArea());
			
		}*/
		
		MinhasFormas.imprimir(formas);
		//MinhasFormas.imprimir(circulo);
		
		//in.close();
		
	}
}
