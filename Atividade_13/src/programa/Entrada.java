package programa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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

	public static String calculaInsertion(int[] i) {
		long tempoInicial = System.nanoTime();
		insertion.sort(i);
		long tempofinal = System.nanoTime();
		return String.format("insertion %d %d\n",((tempofinal-tempoInicial)/1000000),i.length);
	}

	public static String calculaSelection(int[] i) {
		long tempoInicial = System.nanoTime();
		selection.sort(i);
		long tempofinal = System.nanoTime();
		return String.format("selection %d %d\n",((tempofinal-tempoInicial)/1000000),i.length);
	}

	public static String calculaMerge(int[] i) {
		long tempoInicial = System.nanoTime();
		merge.sort(i);
		long tempofinal = System.nanoTime();
		return String.format("merge %d %d\n",((tempofinal-tempoInicial)/1000000),i.length);
	}

	public static String calculaQuick(int[] i) {
		long tempoInicial = System.nanoTime();
		quick.sort(i);
		long tempofinal = System.nanoTime();
		return String.format("quick %d %d\n",((tempofinal-tempoInicial)/1000000),i.length);
	}

	public static String numerosAleatorios() {
		String saida = "alg time sample\n";
		for (int i = 10000; i <= 40000; i += 1000) {
			int[] v = randomArray(i);
			saida += calculaSelection(v);
			saida += calculaInsertion(v);
			saida += calculaMerge(v);
			saida += calculaQuick(v);
		}return saida;

	}
	public static int[] randomArray(int n) {
		int[] v = new int[n];
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			v[i] = rand.nextInt(n);
		}
		return v;
	}

	public static void main(String[] args) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter("sort.data"));
		out.write(numerosAleatorios());
		out.close();
	}

	

}
