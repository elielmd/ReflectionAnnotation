package br.univel.enums;

public enum Uf {
	PR(4,"Paraná"),
	SC(5,"Santa Catarina"), 
	RS(6,"Churrasco");
	
	private int id;
	private String nome;
	
	private Uf(int _id, String _nome) {
		this.id = id;
		this.nome = _nome;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
}
