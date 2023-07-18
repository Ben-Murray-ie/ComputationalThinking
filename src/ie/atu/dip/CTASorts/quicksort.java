package ie.atu.dip.CTASorts;

//References: Geeksforgeeks.com (https://www.geeksforgeeks.org/quick-sort/) & CS Dojo (https://www.youtube.com/watch?v=0SkOjNaO1XY).

/*This implementation of the quicksort algorithm provides functionality to sort a defined section of the array, as opposed to sorting the entire array by default. For the purposes of this benchmark
 * we will override this functionality by defining the "low" parameter as 0 and the "high" parameter as the length of the input array - 1. */

public class quicksort {

	//For convenience, a method is included for swapping two values in an array, identical to the process used in the bubble sort implementation.
	
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

		/*This method determines the partition index of the unsorted array by defining a pivot (in this implementation, the right-most element is used by default) and putting each smaller element to the left and each larger element to the right.*/
	
	static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		
		/*Initialise i, which will represent the largest value smaller than the pivot, and will be used to swap any smaller value found in the array with a higher value found at [i + 1], seen below.
		 *Because i is incremented the first time a value smaller than the pivot is detected, before the swap, we do not risk an out of bounds error by initialising i outside the bounds of the array.*/
		
		int i = (low - 1);
		for (int j = low; j <= high - 1; j++) {
			if (arr[j] < pivot) {

				//Each time a value smaller than the pivot is found, swap the values of i and j, so that only values smaller than the pivot are to the left of I and only values greater than the pivot are to the right of i.
				
				i++;
				swap(arr, i, j);
			}
		}
		
		/*Once this pass is completed, we swap the value at [i + 1], a known value equal to or larger than the pivot, with the value at high. 
		 *By doing this we insert the pivot in it's correct place between the smaller elements on the left and the larger elements on the right.*/
		
		swap(arr, i + 1, high);
		return (i + 1);
	}

	public void quickSort(int[] arr, int low, int high) {
		//Define a base case for the recursive algorithm.
		if (low < high) {

			//To locate the partition index, the array and the desired range (in the case of this program, the full array) are passed into the partition method.
			int pi = partition(arr, low, high);

			//Once the partition for this pass has been determined, recursively call the quickSort method on both sides of the partition. Continue until the array is sorted.
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}
}