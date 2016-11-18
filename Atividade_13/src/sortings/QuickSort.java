package sortings;


public class QuickSort implements Sorting {

	public void sort(int[] elements) {
		ordenacao(elements, 0, elements.length-1);

	}

	public void ordenacao(int[] v, int ini, int fim) {
		int k =  particiona(v, ini, fim);
		if(ini < fim){
			ordenacao(v, ini, k-1);
			ordenacao(v, k+1, fim);
		}
	}

	private int particiona(int[] v, int ini, int fim) {
		int pivot = v[ini];
		int i = ini;
		/*int j = ini + 1;
		while (j <= fim) {
			if (v[j] < pivot) {
				i++;
				swap(v, i, j);
			}
			j++;
		}*/
		for (int j = ini + 1; j <= fim; j++) {
			if(v[j] < pivot){
				i+=1;
				swap(v,i,j);
			}
		}
		swap(v, ini, i);
		return i;

	}

	private void swap(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
		
	}


}
