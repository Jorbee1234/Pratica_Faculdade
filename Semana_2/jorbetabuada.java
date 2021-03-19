package Semana_2;
import java.util.Scanner;

public class jorbetabuada {
	/* Nome : Jorbe Muniz Braga Junior - Matricula : 0050016533 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Olá Jorbe,Digite um numero: ");
		num = input.nextInt();
		System.out.println("Tabuada de somar: " + num);
		for(int x = 0; x<=10; x++) {
			System.out.println(x + "+" + num + "=" + (x + num));
		}
    input.close();  
	}
    
}
