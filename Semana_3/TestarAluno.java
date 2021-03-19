package Semana_3;
import java.util.Scanner;
public class TestarAluno {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seus dados:");
		System.out.println("Seu nome :");
		aluno.setNome(scan.next());
		System.out.println("Sua matricula: ");
		aluno.setMatricula(scan.next());
		System.out.println("Seu curso: ");
		aluno.setCurso(scan.next());
		
		aluno.Listar();
		
		scan.close(); 
	}

}
