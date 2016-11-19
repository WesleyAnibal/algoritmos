package sortings;


public class MergeSort implements Sorting {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

	public void merge(int[] elements, int ini, int med, int fim) {
		int[] auxilio = new int[elements.length];
		for (int i = 0; i < auxilio.length; i++) {
			auxilio[i] = elements[i];
		}
		int x = ini;
		int y = med + 1;
		int z = ini;
		while (x <= med && y <= fim) {
			if (auxilio[x]< auxilio[y]) {
				elements[z++] = auxilio[x++];
			} else {
				elements[z++] = auxilio[y++];
			}
		}
		while (x <= med) {
			elements[z++] = auxilio[x++];
		}
		while (y <= fim) {
			elements[z++] = auxilio[y++];
		}

	}
	

}
