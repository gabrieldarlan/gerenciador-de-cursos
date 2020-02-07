package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {

		Collection<String> alunos = new HashSet<String>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");

		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);
		alunos.remove("Sergio Lopes");
		
		System.out.println(alunos.size());
		for (String aluno : alunos) {
			System.out.println(aluno);
		}

		alunos.forEach((aluno) -> System.out.println(aluno));
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
		Collections.sort(alunosEmLista);
		System.out.println("-------");
		System.out.println("lista ordenada");
		System.out.println("-------");
		alunosEmLista.forEach(aluno -> System.out.println(aluno));
	}
}
