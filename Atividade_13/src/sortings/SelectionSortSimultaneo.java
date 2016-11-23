package sortings;

import java.util.Arrays;

public class SelectionSortSimultaneo {
	public void SelectionSort(int[] v, int ini, int fina) {
		if (ini < fina) {
			int maior = ini;
			int menor = ini;
			for (int i = ini; i <= fina; i++) {
				if (v[i] < v[menor]) {
					menor = i;
				}
				if (v[i] > v[maior]) {
					maior = i;
				}
			}
			if ((ini + fina) == v.length - 1) {
				swap(v, fina, maior);
			} else {
				swap(v, fina, maior);
				swap(v, ini, menor);
			}

			++ini;
			--fina;
			SelectionSort(v, ini, fina);
		}
	}

	private void swap(int[] v, int inicio, int menor) {
		int aux2 = v[inicio];
		v[inicio] = v[menor];
		v[menor] = aux2;
	}

	public static void main(String[] args) {
		int[] x = { 10, 9, 8, 7, 6, 5, 4, 3 };
		new SelectionSortSimultaneo().SelectionSort(x, 0, x.length - 1);
		System.out.println(Arrays.toString(x));
	}

}
