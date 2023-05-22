package aufgabe;

public class SortingEvaluator {

	int arraySize = 10;
	int[] array = new int[arraySize];
	
	public void instantiateArray() {
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()*1000);
		}
	}
	
	public void printArray() {
		for (int i : array) {
			System.out.print(i + "\t");
		}
	}
}
