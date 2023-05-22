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
		int[] tempArray = new int[array.length];
		for(int i = 0; i < array.length; i++)
			tempArray[i] = array[i];
			sSort.sort(tempArray);
			mSort.sort(tempArray);
	}
}
