package sortings;

import java.util.*;

public class bubbleSortbid {

	public void bubbleSort(int[] v) {
		int fim = v.length - 1;
		int inicio = 0;
		boolean achou = true;
		while (achou == true && inicio < fim) {
			achou = false;
			for (int i = inicio; i < fim; i++) {
				if (v[i+1] < v[i]) {
					int aux = v[i];
					v[i] = v[i +1];
					v[i + 1] = aux;
					achou = true;
				}
			}
			fim--;
			for (int i = fim; i > inicio; i--) {
				if (v[i] < v[i - 1]) {
					int aux = v[i];
					v[i] = v[i - 1];
					v[i - 1] = aux;
					achou = true;
				}
			}
			inicio++;
		}

	}

	public static void main(String[] args) {
		int[] x = { 9, 4, -10, 8, 5, -3, 0, 0 };
		new bubbleSortbid().bubbleSort(x);
		System.out.println(Arrays.toString(x));
	}

}
