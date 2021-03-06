package br.univel;

import br.univel.anotacao.Tabela;
import br.univel.enums.EstadoCivil;
import br.univel.enums.Uf;

public class LerAnotacao {
	
	
	public LerAnotacao(Object obj) {
		Class<?> cl = obj.getClass();
		// Class<?> cl2 = Pessoa.class;
		if (cl.isAnnotationPresent(Tabela.class)) {
			Tabela t = cl.getAnnotation(Tabela.class);
			System.out.println(t.value());
		}
			
	}
	
	
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setId(1);
		p.setNome("Bruce Wayne");
		p.setEstadoCivil(EstadoCivil.SOLTEIRO);
		p.setUf(Uf.PR);
		
		System.out.println(p.getUf().getNome());
		
		new LerAnotacao(p);
	}

}
