package br.com.alura.teste;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;

import br.com.alura.model.Aluno;
import br.com.alura.model.Aula;
import br.com.alura.model.Curso;

public class TesteAlunosMatriculados {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java",	"Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		Set<Integer> chaves = javaColecoes.getMatriculaParaAluno().keySet();
		chaves.forEach(System.out::println);
		
		Collection<Aluno> alunos = javaColecoes.getMatriculaParaAluno().values();
		alunos.forEach(System.out::println);
		
		Set<Entry<Integer, Aluno>> associacoes = javaColecoes.getMatriculaParaAluno().entrySet();
		associacoes.forEach(System.out::println);
		
		System.out.println("Quem é o aluno portador da matrícula nº 5617? " + javaColecoes.buscaMatriculado(5617));

	}

}
