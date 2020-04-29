package entity;

public class Pessoa {
	
	private Long id;
	private String nome;
	
	private Pessoa conjuge;
	
	public Pessoa() {
	}

	public Pessoa (Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Pessoa (Long id, String nome, Pessoa conjuge) {
		this.id = id;
		this.nome = nome;
		this.conjuge = conjuge;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Pessoa getConjuge() {
		return conjuge;
	}
	
	public void setConjuge(Pessoa conjuge) {
		this.conjuge = conjuge;
	}
	
	@Override
	public String toString() {
		return "Id: "
				+ id
				+", Nome: "
				+ nome;		

	}
}
