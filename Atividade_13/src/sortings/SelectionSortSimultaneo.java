package sortings;

import java.util.Arrays;

public class SelectionSortSimultaneo {
	public void SelectionSort(int[] v, int ini, int fina) {
		if (ini < fina) {
			int inicio = ini;
			int fim = fina;
			int maior = ini;
			int menor = ini;
			for (int i = ini; i <= fina; i++) {
				if(v[i] < v[menor]){
					menor = i;
				}if(v[i] > v[maior]){
					maior = i;
				}
			}
			
			int aux = v[fim];
			v[fim] = v[maior];
			v[maior] = aux;
			int aux2 = v[inicio];
			v[inicio] = v[menor];
			v[menor] = aux2;
			ini++;
			fina--;
			SelectionSort(v,ini ,fina );
		}
	}

	public static void main(String[] args) {
		int[] x = { 9, 4, -10, 8, 5, -3, 0, 0 };
		new SelectionSortSimultaneo().SelectionSort(x, 0, x.length - 1);
		System.out.println(Arrays.toString(x));
	}

}
