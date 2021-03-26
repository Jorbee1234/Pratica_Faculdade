package Semana_5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;

public class Acao implements II_ibovesp  {

	private String nome;
	private Float preco;
	private Float valorizacao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Float getPreco() {
		return preco;
	}
	public void setPreco(Float preco) {
		this.preco = preco;
	}
	public Float getValorizacao() {
		return valorizacao;
	}
	public void setValorizacao(Float valorizacao) {
		this.valorizacao = valorizacao;
	}
	@Override
	public String toString() { // Mostra todas as informações solicitadas em uma só linha
		return "Acao [nome=" + nome + ", preco=" + preco + ", valorizacao=" + valorizacao + "]";
	}
	@Override
	public void listar(ArrayList<Acao> acoes) {
		System.out.println("Lista evolucao da petrobras");
		
		for(Acao minhAcao : acoes) {
			System.out.println(minhAcao);
		}
		
	}
	  @Override
	    public void ordenar(ArrayList<Acao> acoes) {
	        System.out.println("Sem orderna: " + acoes);
	        
	        Collections.sort(acoes, new Comparator<Acao>() {

	            public  int compare(Acao o1, Acao o2){
	                return Float.compare(o1.getPreco(), o2.getPreco());
	            }
	        });

	        System.out.println("Com ordernação " + acoes);
	    }
		
}

