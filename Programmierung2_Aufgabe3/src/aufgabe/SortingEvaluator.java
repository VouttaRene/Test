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
		
		
		printStatistics(selectionTimes, mergeTimes);
	}
	
	private void printStatistics(ArrayList<Long> selectionTimes, ArrayList<Long> mergeTimes) {
		System.out.println("---SELECTIONSORT STATISTICS---\n");
		if(arraySize <= 10) {
			printArray(array);
		}
		System.out.println("Performances of the algorithm (in nanoseconds):");
		for(Long i : selectionTimes)
			System.out.print(i + " ");
		
		System.out.println("\n\nLowest value: " + findLowestValue(selectionTimes) + " nanoseconds"
				+ "\nHighest value: " + findHighestValue(selectionTimes) + " nanoseconds"
				+ "\nAverage value: " + findAverageValue(selectionTimes) + " nanoseconds");
		
		System.out.println("\n---MERGESORT STATISTICS---\n");
		if(arraySize <= 10) {
			printArray(array);
		}
		System.out.println("Performances of the algorithm (in nanoseconds):");
		for(Long i : mergeTimes)
			System.out.print(i + " ");
		
		System.out.println("\n\nLowest value: " + findLowestValue(mergeTimes) + " nanoseconds"
				+ "\nHighest value: " + findHighestValue(mergeTimes) + " nanoseconds"
				+ "\nAverage value: " + findAverageValue(mergeTimes) + " nanoseconds");
		
		System.out.println("\n---PERFORMANCE COMPARISON---\n");
		System.out.print("Arraysize: " + arraySize + ", ");
		performanceComparison(selectionTimes, mergeTimes);
		
	}
	
	private void performanceComparison(ArrayList<Long> selectionTimes, ArrayList<Long> mergeTimes) {
		long averageSelectionTime = findAverageValue(selectionTimes);
		long averageMergeTime = findAverageValue(mergeTimes);
		
		if(averageSelectionTime < averageMergeTime)
			System.out.print("Selectionsort outperformed Mergesort");
		else
			System.out.print("Mergesort outperformed Selectionsort");
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
	
	public void printArray(int[] tempArray) {
		int marker = tempArray.length - 1;
		while(marker >= 0) {
			int max = 0;
			for(int i = 1; i < marker; i++) {
				if(tempArray[i] > tempArray[max])
					max = i;
			}
			
			swap(tempArray, marker, max);
			marker--;
		}
		System.out.print("Sorted Array:\n[ ");
		for(int i : tempArray) {
			System.out.print(i + " ");
		}
		System.out.println("]\n");
	}
	
	private void swap(int[] tempArray, int idx1, int idx2) {
		int tmp = tempArray[idx1];
		tempArray[idx1] = tempArray[idx2];
		tempArray[idx2] = tmp;
	}
}
