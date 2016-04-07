package br.univel;

import br.univel.anotacao.Tabela;
import br.univel.enums.EstadoCivil;
import br.univel.enums.Uf;

@Tabela("cad_pessoa")
public class Pessoa {
	
	//@Tabela("oi") Nao pode colocar por causa do target na anotation Tabela
	private int id;
	private String nome;
	private EstadoCivil estadoCivil;
	private Uf uf;

	public Uf getUf() {
		return uf;
	}

	public void setUf(Uf uf) {
		this.uf = uf;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

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
