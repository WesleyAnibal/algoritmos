package sortings;


public class InsertionSort implements Sorting {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void sort(int[] V){
		for (int i = 1; i < V.length; i++) {
			int k = i;
			while (k >0 && V[k]<V[k-1]) {
				swap(V,k-1,k);
				k--;
			}
		}
		
	}
	private void swap(int[] V, int menor, int maior) {
		int aux = V[maior];
		V[maior] = V[menor];
		V[menor] = aux;

	}
}
