package sortings;


public class InsertionSort <T extends Comparable<T>> implements Sorting<T> {
	public void sort(T[] V){
		for (int i = 1; i < V.length; i++) {
			int k = i;
			while (k >0 && (V[k] !=null && V[k-1] != null) && V[k].compareTo(V[k-1])<0) {
				swap(V,k-1,k);
				k--;
			}
		}
		
	}
	private void swap(T[] V, int menor, int maior) {
		T aux = V[maior];
		V[maior] = V[menor];
		V[menor] = aux;

	}
}
