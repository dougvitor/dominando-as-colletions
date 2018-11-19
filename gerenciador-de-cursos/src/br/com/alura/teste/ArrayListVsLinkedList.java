package br.com.alura.teste;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {
		System.out.println("***** ArrayList vs LinkedList ****");

		List<Integer> numerosArrayList = new ArrayList<>();
		List<Integer> numerosLinkedList = new LinkedList<>();
		int quantidadeElementos = 1000000;

		long tempoInsercaoArrayList = insereElementosNo(numerosArrayList, quantidadeElementos);
		long tempoInsercaoLinkedList = insereElementosNo(numerosLinkedList, quantidadeElementos);

		System.out.println("Inserção na ArrayList demorou  " + tempoInsercaoArrayList);
		System.out.println("Inserção na LinkedList demorou " + tempoInsercaoLinkedList);

		long tempoRemocaoArrayList = removePrimeirosElementos(numerosArrayList);
		long tempoRemocaoLinkedList = removePrimeirosElementos(numerosLinkedList);

		System.out.println("Remoção da ArrayList demorou  " + tempoRemocaoArrayList);
		System.out.println("Remoção da LinkedList demorou " + tempoRemocaoLinkedList);
		
		System.out.println("Tempo Total ArrayList  " + (tempoInsercaoArrayList + tempoRemocaoArrayList));
		System.out.println("Tempo Total LinkedList " + (tempoInsercaoLinkedList + tempoRemocaoLinkedList)) ;
	}

	/*
	 * removendo 100 elementos sempre na primeira posição
	 */
	private static long removePrimeirosElementos(List<Integer> numeros) {
		long ini = System.currentTimeMillis();

		for (int i = 0; i < 100; i++) {
			numeros.remove(0); // removendo sempre o primeiro elemento
		}
		long fim = System.currentTimeMillis();
		return fim - ini;
	}

	private static long insereElementosNo(List<Integer> numeros, int quantidade) {
		long ini = System.currentTimeMillis();
		for (int i = 0; i < quantidade; i++) {
			numeros.add(i);
		}
		long fim = System.currentTimeMillis();
		return fim - ini;
	}

}
