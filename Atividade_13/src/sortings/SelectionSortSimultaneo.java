package sortings;

import java.util.Arrays;

public class SelectionSortSimultaneo {
	public void SelectionSort(int[] v, int ini, int fina) {
		if (ini < fina) {
			int maior = ini;
			int menor = ini;
			for (int i = maior + 1; i <= fina; i++) {
				if (v[i] > v[maior]) {
					maior = i;
				}
			}
			swap(v, maior, fina);
			fina--;
			for (int i = fina; i > ini; i--) {
				if (v[i] < v[menor]) {
					menor = i;
				}
			}
			swap(v, ini, menor);
			ini++;
			SelectionSort(v, ini, fina);
		}
	}

	private void swap(int[] v, int inicio, int menor) {
		int aux2 = v[inicio];
		v[inicio] = v[menor];
		v[menor] = aux2;
	}

	public static void main(String[] args) {
		int[] x = { 0,0,0,0,0};
		new SelectionSortSimultaneo().SelectionSort(x, 0, x.length - 1);
		System.out.println(Arrays.toString(x));
	}

}
