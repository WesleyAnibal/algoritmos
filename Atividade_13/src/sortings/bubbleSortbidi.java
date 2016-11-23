import java.util.*;

public class bubbleSortbid{

	public void bubbleSort(int[] v){
		int cout = v.length-1;

		while(true){
			boolean achou = false;
			for(int i = 1; i < v.length; i++{
				if(v[i] < v[i-1]){
					int aux = v[i];
					v[i] = v[i-1];
					v[i-1] = v[i];
					achou = true;
				}
				if(v[cout] < v[cout-1]){
					int aux = v[cout];
					v[cout] = v[cout-1];
					v[cout-1] = aux;
					achou = true;
					cout--;
				}
			}
		if(achou == false){
			break;
		}	

		}
	
	}









}
