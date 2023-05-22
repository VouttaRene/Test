package aufgabe;

public class MergeSort implements SortAlgorithm {

	@Override
	public void sort(int[] array) {
		
		int r = array[array.length - 1];
		int l = array[0];
		
		int i, j, k;
		int[] b = new int[array.length];
		
		if(r>l) {
			int mid = (r+l) / 2;
			sort(array);
			sort(array);
			
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
