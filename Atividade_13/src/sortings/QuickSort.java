package sortings;

import java.util.Arrays;

public class QuickSort implements Sorting {

	public void sort(int[] elements) {
		ordenacao(elements, 0, elements.length-1);

	}

	public void ordenacao(int[] v, int ini, int fim) {
		
		if(ini < fim){
			int k =  particiona(v, ini, fim);
			ordenacao(v, ini, k-1);
			ordenacao(v, k+1, fim);
		}
	}

	private int particiona(int[] v, int ini, int fim) {
		int pivot = v[ini];
        int i = ini;

        for (int j = ini + 1; j <= fim; j++) {
            if (v[j] < pivot) {
                i+=1;
                swap(v, i, j);
            }
        }

        // troca pivot (v[ini]) com i.
        swap(v, ini, i);
        
        return i;
	}

	private void swap(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
		
	}public String toString(){
		return "quick";
	}


}
