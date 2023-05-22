package aufgabe;

public class MergeSort implements SortAlgorithm {

	private void sort(int[] array, int l, int r) {
		
		int i, j, k;
		int[] b = new int[array.length];
		
		if(r>l) {
			int mid = (r+l) / 2;
			sort(array, l, mid);
			sort(array, mid + 1, r);
			
			for (i = mid + 1; i > l; i--) {
				b[i-1] = array[i - 1];
			for(j = mid; j < r; j ++)
				b[r + mid - j] = array[j + 1];
			for(k = l; k <= r; k++)
				if(b[i] < b[j])
					array[k] = b[i++];
				else
					array[k] = b[j--];
			}
		}
		
	}
}
