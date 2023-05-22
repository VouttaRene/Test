package aufgabe;

public class MergeSort implements SortAlgorithm {
		
	@Override
	public void sort(int[] array) {
		
		int r = array[array.length - 1];
		int l = array[0];
		
		int[] leftArray, rightArray;
		
		int i, j, k;
		int[] b = new int[array.length];
		
		if(r>l) {
			int mid = (r+l) / 2;
			leftArray = new int[mid];
			rightArray = new int[mid];
			for(int temp = 0; temp < array.length; temp++) {
				if(temp <= mid)
					leftArray[temp] = array[temp];
				else
					rightArray[temp - mid] = array[temp];
			}
			sort(leftArray);
			sort(rightArray);
			
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
		
		System.out.println("Mergesort:");
		for(int a : array)
			System.out.print(a);
		System.out.println("\nEnde");
	}
	
	//public int[] getArray
}
