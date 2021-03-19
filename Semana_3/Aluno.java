package Semana_3;

public class Aluno {
   private String matricula;
   private String nome;
   private String curso;

public void setMatricula(String matricula) {
	this.matricula = matricula;
}

public void setNome(String nome) {
	this.nome = nome;
}

public void setCurso(String curso) {
	this.curso = curso;
}
public void Listar(){
	System.out.println("Nome = " + this.nome);
	System.out.println("Matricula = " + this.matricula);
	if(this.curso.equals("SI")||this.curso.equals("si")) {//Para comparar valores usa-se equals - para conteudos e == Aponta para mesma localização na memoria  
	System.out.println("Sistema de informação");	
	}else {
	System.out.println("Curso = " + this.curso);
	}
}
   
}
