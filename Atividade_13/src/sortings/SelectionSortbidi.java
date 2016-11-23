import java.util.Arrays;

public class SelectionSortbidi {
	public void SelectionSort(int[] v) {
		int fim = v.length - 1;
		int inicio = 0;
		for (int j = inicio; j <= fim; j++) {
			int maior = j;
			for (int i = maior + 1; i <= fim; i++) {
				if (v[i] > v[maior]) {
					maior = i;
				}
			}
			int aux = v[fim];
			v[fim] = v[maior];
			v[maior] = aux;
			fim--;
			int menor = j;
			for (int i = fim; i > inicio; i--) {
				if (v[i] < v[menor]) {
					menor = i;
				}
			}
			int aux2 = v[inicio];
			v[inicio] = v[menor];
			v[menor] = aux2;
			inicio++;
		}
	}

	public static void main(String[] args) {
		int[] x = { 9, 4, -10, 8, 5, -3, 0, 0 };
		new SelectionSortbidi().SelectionSort(x);
		System.out.println(Arrays.toString(x));
	}

}
