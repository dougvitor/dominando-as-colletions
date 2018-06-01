package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ListVsSet {
	
	public static void main(String[] args) {
		
		manterCollection(new HashSet<>());
		manterCollection(new ArrayList<>());
	}
	
	
	private static void manterCollection(Collection<Integer> col) {
		
		long inicio = System.currentTimeMillis();
		

        for (int i = 1; i <= 100000; i++) {
            col.add(i);
        }
        
        long fim = System.currentTimeMillis();
        
        long totalInsercao = fim - inicio;
        
        System.out.println(col.getClass().getSimpleName() + " Tempo gasto Inserção: " + totalInsercao);

        inicio = System.currentTimeMillis();
        
        for (Integer numero : col) {
            col.contains(numero);
        }

        fim = System.currentTimeMillis();
        
        long totalPesquisa = fim - inicio;

        System.out.println(col.getClass().getSimpleName() + " Tempo gasto pesquisa: " + totalPesquisa);
        
        System.out.println(col.getClass().getSimpleName() + " Tempo total gasto: " + (totalInsercao + totalPesquisa));

	}
}
