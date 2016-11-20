package programa;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;

import sortings.InsertionSort;
import sortings.MergeSort;
import sortings.QuickSort;
import sortings.SelectionSort;
import sortings.Sorting;

public class Entrada {

	public static void testaAlgoritmo(Sorting strategy, int n) throws FileNotFoundException {
		
		int[] vetor = criaArrayRandom(n);
		long tempoInicial = System.nanoTime();
		strategy.sort(vetor);
		long tempofinal = System.nanoTime();
		System.out.print("------- " + strategy.toString() + " -------- " + "\n");
		long tempo = (tempofinal - tempoInicial) / 1000000; 
		System.out.println("Tempo: " + tempo + " Entrada: " + n);
		FileOutputStream fos = new FileOutputStream("teste.txt", true);
		PrintStream ps = new PrintStream(fos);
		ps.println(strategy.toString() + " " + tempo + " " + n);
		//System.out.println(isSorted(vetor));

	}

	public static int[] criaArrayRandom(int n) {

		int array[] = new int[n];
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			array[i] = r.nextInt();
		}

		return array;
	}

	public static boolean isSorted(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false; 
			}
		}

		return true;
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		Sorting selection = new SelectionSort();
		Sorting insertion = new InsertionSort();
		Sorting merge = new MergeSort();
		Sorting quick = new QuickSort();

		
		for(int i = 10000; i <= 40000; i+= 1000){
			System.out.println("----Pata tamanho " + i + " -----");
			testaAlgoritmo(selection,i);
			testaAlgoritmo(insertion,i);
			testaAlgoritmo(merge,i);
			testaAlgoritmo(quick,i);
		}

	}

}