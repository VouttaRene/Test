package aufgabe;

import java.util.ArrayList;

public class SortingEvaluator {

	
	int arraySize = 10;
	int[] array = new int[arraySize];
	
	private void instantiateArray() {
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()*10000);
		}
	}
	
	public void calculateRuntime() {
		instantiateArray();
		
		SortAlgorithm sSort = new SelectionSort();
		SortAlgorithm mSort = new MergeSort();
		
		Stopwatch stopwatch = new Stopwatch();
		
		ArrayList<Long> selectionTimes = new ArrayList<Long>();
		ArrayList<Long> mergeTimes = new ArrayList<Long>();
		
		for(int i = 0; i < 100; i++) {
			
			//SelectionSort
			stopwatch.startStopwatch();
			sSort.sort(array);
			selectionTimes.add(stopwatch.getDuration());
			stopwatch.stoppStopwatch();
			
			//MergeSort
			stopwatch.startStopwatch();
			mSort.sort(array);
			mergeTimes.add(stopwatch.getDuration());
			stopwatch.stoppStopwatch();			
		}
		
		
		
		
		System.out.println(findLowestValue(mergeTimes));
	}
	
	private void printStatistics(ArrayList<Long> selectionTimes, ArrayList<Long> mergeTimes) {
		System.out.println();
	}
	
	private long findLowestValue(ArrayList<Long> list) {
		long min = list.get(0);
		for(long i : list) {
			if(i < min)
				min = i;
		}
		return min;
	}
	
	private long findHighestValue(ArrayList<Long> list) {
		long max = list.get(0);
		for(long i : list) {
			if(i > max)
				max = i;
		}
		return max;
	}
	
	private long findAverageValue(ArrayList<Long> list) {
		long avg = 0;
		for(long i : list)
			avg += i;
		return avg / list.size();
	}
	
	public void sortArray(int[] array) {
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
