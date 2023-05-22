package aufgabe;

public class SortingEvaluator {

	SortAlgorithm sSort = new SelectionSort();
	SortAlgorithm mSort = new MergeSort();
	
	int arraySize = 10;
	int[] array = new int[arraySize];
	
	public void instantiateArray() {
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()*10000);
		}
	}
	
	public void calculateRuntime() {
		instantiateArray();
		int[] sSortedArray = new int[array.length];
		int[] mSortedArray = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			sSortedArray[i] = array[i];
			mSortedArray[i] = array[i];
		}
		
		
		sSort.sort(sSortedArray);
		mSort.sort(mSortedArray);
		printArray(sSortedArray);
	}
	
	private void printArray(int[] array) {
		for(int i : array)
			System.out.print(i + "\t");
	}
}
