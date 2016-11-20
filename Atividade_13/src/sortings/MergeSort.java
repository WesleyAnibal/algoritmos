package sortings;


public class MergeSort implements Sorting {


	@Override
	public void sort(int[] elements) {
		ordenacao(elements, 0, elements.length-1);
	}

	public void ordenacao(int[] V, int ini, int fim) {
		if (ini < fim) {
			int med = (ini + fim) / 2;
			ordenacao(V, ini, med);
			ordenacao(V, med + 1, fim);
			merge(V, ini, med, fim);
		}
	}

	public void merge(int[] v, int ini, int med, int fim) {
		int[] helper = new int[v.length];

        for (int i = 0; i < v.length; i++) {
            helper[i] = v[i];
        }

        int i = ini;
        int j = med + 1;
        int k = ini;
    
        while (i <= med && j <= fim) {
            if (helper[i] < helper[j]) {
                v[k] = helper[i];
                i++;
            } else {
                v[k] = helper[j];
                j++;
            }

            k++;
        
        }
        
        // primeira metade não foi toda consumida: fazer append de todos
        // os elementos da primeira metade
        while (i <= med) {
            v[k] = helper[i];
            k+=1;
            i+=1;
        }

        // segunda metade não foi toda consumida: fazer append de todos
        // os elementos da segunda metade
        while (j <= fim) {
            v[k] = helper[j];
            k+=1;
            j+=1;
        }


	}public String toString(){
		return "merge";
	}
	

}
