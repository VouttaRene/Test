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
	public void mergeSort(int[] array, int l, int r) {
		int  i, j, k;
		int[] b = new int [array.length];
		if ( r > l ) {
			int mid = ( r + l ) / 2;
			
			mergeSort( array , l , mid ) ;
			mergeSort( array , mid + 1 , r ) ;
				
			for ( i = mid + 1; i > l ; i--)
				b[i - 1] = array[i - 1 ] ;
			for ( j = mid ; j < r ; j ++)
				b [ r + mid - j ] = array [ j + 1 ] ;
			for ( k = l ; k <= r ; k ++)
				if ( b [ i ] < b [ j ] )
					array [ k ] = b [ i++];
				else
					array[k] = b [j--];
		}
	}
}
