package sortings;


public class QuickSort<T extends Comparable<T>> implements Sorting<T> {

	@Override
	public void sort(T[] elements) {
		ordenacao(elements, 0, elements.length-1);

	}

	public void ordenacao(T[] v, int ini, int fim) {
		
		if(ini < fim){
			int k =  particiona(v, ini, fim);
			ordenacao(v, ini, k-1);
			ordenacao(v, k+1, fim);
		}
	}

	private int particiona(T[] v, int ini, int fim) {
		T pivot = v[ini];
		int i = ini;
		int j = i + 1;
		while (j <= fim) {
			if (v[j].compareTo(pivot) < 0) {
				i++;
				swap(v, j, i);
			}
			j++;
		}
		swap(v, ini, i);
		return i;

	}

	private void swap(T[] v, int j, int i) {
		T aux = v[j];
		v[j] = v[i];
		v[i] = aux;
		
	}


}
