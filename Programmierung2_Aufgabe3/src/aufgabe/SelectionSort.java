package aufgabe;

public class SelectionSort implements SortAlgorithm {

	private void sort(int[] array) {
		int marker = array.length - 1;
		while(marker >= 0) {
			int max = 0;
			for(int i = 1; i < marker; i++) {
				if(array[i] > array[max])
					max = i;
			}
			
			swap(array, marker, max);
			marker--;
		}
	}
	
	private void swap(int[] array, int idx1, int idx2) {
		int tmp = array[idx1];
		array[idx1] = array[idx2];
		array[idx2] = tmp;
	}
}
