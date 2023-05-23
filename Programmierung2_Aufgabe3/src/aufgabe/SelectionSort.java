package aufgabe;
/**
 * 
 * @author René Voutta
 * @mail u38509@hs-harz.de
 * @version 1.0
 * 
 * This class is the basis for the 'SelectionSort' object and implements SortAlgorithm interface
 */
public class SelectionSort implements SortAlgorithm {

	/**
	 * This method executes the selection sort algorithm
	 */
	@Override
	public void sort(int[] array) {
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
	/**
	 * 
	 * @param array
	 * @param idx1
	 * @param idx2
	 * 
	 * This method swaps two variables inside an array
	 */
	private void swap(int[] array, int idx1, int idx2) {
		int tmp = array[idx1];
		array[idx1] = array[idx2];
		array[idx2] = tmp;
	}
}
