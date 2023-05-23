package aufgabe;
/**
 * 
 * @author René Voutta
 * @mail u38509@hs-harz.de
 * @version 1.0
 * 
 * This class is the basis for the 'MergeSort' object and implements SortAlgorithm interface
 */
public class MergeSort implements SortAlgorithm {
		
	@Override
	public void sort(int[] array) {
		mergeSort(array, 0, array.length-1);
	}

	/**
	 * 
	 * @param array
	 * @param l
	 * @param r
	 * 
	 * This method executes the mergeSort algorithm
	 */
//	public void mergeSort(int[] array, int l, int r) {
//		int  i, j, k;
//		int[] b = new int[array.length];
//		if ( r > l ) {
//			int mid = ( r + l ) / 2;
//			
//			mergeSort(array, l, mid);
//			mergeSort(array, mid + 1, r);
//				
//			for(i = mid + 1; i > l; i--)
//				b[i - 1] = array[i - 1];
//			for (j = mid; j < r; j++)
//				b[r + mid - j] = array[j + 1];
//			for (k = l; k <= r; k++)
//				if (b[i] < b[j])
//					array[k] = b[i++];
//				else
//					array[k] = b[j--];
//		}
//	}
	
	private int[] mergeSort(int[] elements, int left, int right) {
	    // End of recursion reached?
	    if (left == right) return new int[]{elements[left]};

	    int middle = left + (right - left) / 2;
	    int[] leftArray = mergeSort(elements, left, middle);
	    int[] rightArray = mergeSort(elements, middle + 1, right);
	    return merge(leftArray, rightArray);
	}
  
	int[] merge(int[] leftArray, int[] rightArray) {
	    int leftLen = leftArray.length;
	    int rightLen = rightArray.length;

	    int[] target = new int[leftLen + rightLen];
	    int targetPos = 0;
	    int leftPos = 0;
	    int rightPos = 0;

	    // As long as both arrays contain elements...
	    while (leftPos < leftLen && rightPos < rightLen) {
	      // Which one is smaller?
	      int leftValue = leftArray[leftPos];
	      int rightValue = rightArray[rightPos];
	      if (leftValue <= rightValue) {
	        target[targetPos++] = leftValue;
	        leftPos++;
	      } else {
	        target[targetPos++] = rightValue;
	        rightPos++;
	      }
	    }
	    // Copy the rest
	    while (leftPos < leftLen) {
	      target[targetPos++] = leftArray[leftPos++];
	    }
	    while (rightPos < rightLen) {
	      target[targetPos++] = rightArray[rightPos++];
	    }
	    return target;
	  }
}
