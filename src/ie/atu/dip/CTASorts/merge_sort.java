package ie.atu.dip.CTASorts;

//References: Geeksforgeeks.org (https://www.geeksforgeeks.org/merge-sort/) & Coding with John (https://www.youtube.com/watch?v=bOk35XmHPKs).

public class merge_sort {
	public void mergeSort(int[] inputArray) {
		int inputLength = inputArray.length;
		
		//If input array is one element long, no sorting is required. This acts as a base case for the recursive portion of the merge sort algorithm.
		
		if (inputLength < 2) {
			return;
		}
		
		//Here we separate the input array into 2 sub-arrays, with midIndex defining the end of the left sub-array and the start of the right subarray.
		
		int midIndex = inputLength / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLength - midIndex];
		
		//Here we populate the sub-arrays with elements from the input array.
		
		for (int i = 0; i < midIndex; i++) {
			leftHalf[i] = inputArray[i];
		}
		for (int i = midIndex; i < inputLength; i++) {
			rightHalf[i - midIndex] = inputArray[i];
		}
		
		//Here we recursively call the above method to repeatedly break the two addressed sub-arrays down until only a series of single element sub-arrays is left.
		
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		
		//Here we recursively rebuild progressively larger sub-arrays in sorted order until the sorted array is built. 
		
		merge(inputArray, leftHalf, rightHalf);
	}

	private static int[] merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;
		
		//Here we declare 3 ints to act as loop iterators for each of the left, right and merged (input) arrays.
		
		int i = 0, j = 0, k = 0;
		
		/*Below we are comparing elements from each array and inputting the smallest value into the merged array. Each time an element is added to the merged array, we address the next element in the array it 
		 * was selected from, until no unsorted elements remain in one of the two (left and right) arrays.*/
		
		while (i < leftSize && j < rightSize) {
			if (leftHalf[i] <= rightHalf[j]) {
				inputArray[k] = leftHalf[i];
				i++;
			} else {
				inputArray[k] = rightHalf[j];
				j++;
			}
			k++;
		}
		
		//When no elements are left to be sorted in either the left or right arrays, the remaining elements from whichever array still contains unsorted elements are added to the merged array.
		
		while (i < leftSize) {
			inputArray[k] = leftHalf[i];
			i++;
			k++;
		}

		while (j < rightSize) {
			inputArray[k] = rightHalf[j];
			j++;
			k++;
		}
		return inputArray;
	}
}