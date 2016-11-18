package sortings;

public class SelectionSort implements Sorting {

	@Override
	public void sort(int[] elements) {
		for (int j = 0; j < elements.length; j++) {

			int menor = j;
			for (int i = j; i < elements.length; i++) {
				if (elements[i]<elements[menor]) {
					menor = i;
				}
			}
			swap(elements, menor, j);
		}
	}

	private void swap(int[] elements, int x, int y) {
		int aux = elements[x];
		elements[x] = elements[y];
		elements[y] = aux;

	}

}
