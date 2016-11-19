package sortings;

import java.util.Arrays;

public class QuickSort implements Sorting {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void sort(int[] elements) {
		ordenacao(elements, 0, elements.length-1);

	}

	public void ordenacao(int[] v, int ini, int fim) {
		
		if(ini <= fim){
			int k =  particiona(v, ini, fim);
			ordenacao(v, ini, k-1);
			ordenacao(v, k+1, fim);
		}
	}

	private int particiona(int[] v, int ini, int fim) {
		int pivot = v[(ini+fim)/2];
		int i = ini;
		int j = ini + 1;
		while (j <= fim) {
			if (v[j] < pivot) {
				i++;
				swap(v, i, j);
			}
			j+=1;
		}
		swap(v, ini, i);
		return i;

	}

	private void swap(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
		
	}public static void main(String[] args) {
		int[] x = {1,5,10,99,100,101};
		new QuickSort().sort(x);
		System.out.println(Arrays.toString(x));
	}


}
