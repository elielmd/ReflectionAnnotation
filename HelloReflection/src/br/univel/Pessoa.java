package br.univel;

import br.univel.anotacao.Tabela;

@Tabela("cad_pessoa")
public class Pessoa {
	
	//@Tabela("oi") Nao pode colocar por causa do target na anotation Tabela
	private int id;
	
	private String nome;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
