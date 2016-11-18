package programa;

import java.util.Arrays;
import java.util.Random;

import sortings.InsertionSort;
import sortings.MergeSort;
import sortings.QuickSort;
import sortings.SelectionSort;
import sortings.Sorting;

public class Entrada<T> {
	static private Sorting insertion = new InsertionSort();
	static private Sorting selection = new SelectionSort();
	static private Sorting merge = new MergeSort();
	static private Sorting quick = new QuickSort();
	public static void calculaInsertion(int[] i){
		long tempoInicial = System.nanoTime();
		insertion.sort(i);
		long tempofinal = System.nanoTime();
		System.out.print("Insertion ");
		System.out.println(tempofinal - tempoInicial);
	}
	public static void calculaSelection(int[] i){
		long tempoInicial = System.nanoTime();
		selection.sort(i);
		long tempofinal = System.nanoTime();
		System.out.print("Selection ");
		System.out.println(tempofinal - tempoInicial);
	}
	public static void calculaMerge(int[] i){
		long tempoInicial = System.nanoTime();
		merge.sort(i);
		long tempofinal = System.nanoTime();
		System.out.print("Merge ");
		System.out.println(tempofinal - tempoInicial);
	}
	public static void calculaQuick(int[] i){
		long tempoInicial = System.nanoTime();
		quick.sort(i);
		long tempofinal = System.nanoTime();
		System.out.print("Quick ");
		System.out.println(tempofinal - tempoInicial);
	}
	public static void numerosAleatorios(){
		for (int i = 10000; i <= 40000; i+=1000) {
			int[] v = randomArray(i);
			calculaInsertion(v);
			calculaSelection(v);
			calculaMerge(v);
			calculaQuick(v);
		}
		
		
		
	}public static void main(String[] args) {
		numerosAleatorios();
	}
	
	public static int[] randomArray(int n) {
		int[] v = new int[n];
		Random rand = new Random();
		for (int i = 0; i < v.length; i++) {
			v[i] = rand.nextInt(n);
		}
		return v;
	}

	
}
