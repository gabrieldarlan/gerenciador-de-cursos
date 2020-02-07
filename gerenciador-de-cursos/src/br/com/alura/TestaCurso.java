package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java",
				"Paulo Silveira");

		javaColecoes.adicina(new Aula("Trabalhando com ArrayList",21));
		javaColecoes.adicina(new Aula("Criando uma aula",20));
		javaColecoes.adicina(new Aula("Modelando com coleções",22));
		
		List<Aula> aulas = javaColecoes.getAulas();
		
		System.out.println(javaColecoes.getAulas());
		
		
	}
}
