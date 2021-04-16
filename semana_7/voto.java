package semana_7;

public class voto implements Comparable <voto> {
	private String nome;
	private Integer qtdVotos; // Integer = Int
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQtdVotos() {
		return qtdVotos;
	}

	public void setQtdVotos(Integer qtdVotos) {
		this.qtdVotos = qtdVotos;
	}

	public voto(String nome, Integer qtdVotos) {
		this.nome = nome;
		this.qtdVotos = qtdVotos;
	}
	
	@Override
	public int compareTo(voto outro) {
		if(this.qtdVotos < outro.getQtdVotos())
			return -1;
		else if(this.qtdVotos > outro.getQtdVotos())
			return 1;
		else 
			return 0;
	}
}
