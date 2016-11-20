package sortings;

public class InsertionSort implements Sorting {

	public void sort(int[] seq) {
		int i, j, atual;

		for (i = 1; i < seq.length; i++) {

			atual = seq[i];

			j = i;

			while ((j > 0) && (seq[j - 1] > atual)) {
				seq[j] = seq[j - 1];
				j = j - 1;
			}
			seq[j] = atual;
		}

	}

	private void swap(int[] V, int menor, int maior) {
		int aux = V[maior];
		V[maior] = V[menor];
		V[menor] = aux;

	}

	public String toString() {
		return "insertion";
	}
}
