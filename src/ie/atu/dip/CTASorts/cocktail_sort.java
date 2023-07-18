package ie.atu.dip.CTASorts;

//References: Geeksforgeeks.com (https://www.geeksforgeeks.org/cocktail-sort/).

public class cocktail_sort {
	public void cocktailSort(int a[]) {
		
		//Define variables to house values for use in the algorithm. Boolean "swapped" acts as a check, if no swaps are made, the list is sorted. Ints "start" and "end" are shorthand for the first and last elements of the input array.
		
		boolean swapped = true;
		int start = 0;
		int end = a.length;
		
		/*This while loop determines whether the array is sorted. True by default, the value is immediately made false at the beginning of the loop. 
		 *If a swap procedure is done, the value is changed to true, indicating that the loop should run again. If not, the array is sorted.
		 *The mechanism for comparing and sorting the elements in each pass is identical to bubble sort.*/
		
		while (swapped == true) {
			swapped = false;
			for (int i = start; i < end - 1; ++i) {
				if (a[i] > a[i + 1]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					swapped = true;
				}
			}
			
			//Check if array is sorted, and if so, end the program.
			
			if (swapped == false)
				break;
			
			//If not, reset the swapped check so the second portion of the algorithm, pushing the smallest value to the bottom of the array, can begin.
			
			swapped = false;

			//It can be safely assumed that the element at the last index of the array has been sorted, so it should be ignored on further passes.
			end = end - 1;

			//Perform the comparison and swap sorting method from the first portion, but in reverse, starting from the new top of the array (end - 1).
			for (int i = end - 1; i >= start; i--) {
				if (a[i] > a[i + 1]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					swapped = true;
				}
			}

			//Once the second portion of the sorting pass has completed, we can assume that the first element in the array is sorted, and should be excluded from further passes.
			start = start + 1;
		}
	}
}
