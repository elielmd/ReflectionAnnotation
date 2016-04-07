package br.univel;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Teste {
	
	public Teste(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class<?> cl = obj.getClass();
		
		int cont;
		
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO ");
		sb.append(cl.getSimpleName().toUpperCase()).append("(");
		
		Field[] vetorFields = cl.getDeclaredFields();
		int qtdFields = vetorFields.length;
		for(int i = 0; i < qtdFields; i ++) {
			Field field = vetorFields[i];
			//System.out.println(field.getName() + " " + field.getType());
			sb.append(field.getName());
			if (i < qtdFields - 1) {
				sb.append(", ");
			}
		}
		
		sb.append(") VALUES(");
		
		sb.append(cl.getSimpleName()).append(")");
		String sql = sb.toString();
		System.out.println(sql);
			
	/*	for (Method m: cl.getDeclaredMethods()) {
			if(m.getName().startsWith("get")) {
				Object retorno = m.invoke(obj, null);
				System.out.println(retorno);
			}
		}	*/

	}
	
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.setId(1);
		p.setNome("Eliel");
		
		try {
			new Teste(p);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
