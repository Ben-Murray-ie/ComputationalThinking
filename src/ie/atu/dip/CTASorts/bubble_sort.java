package ie.atu.dip.CTASorts;

//References: Geeksforgeeks.org (https://www.geeksforgeeks.org/bubble-sort/) & Coding with John (https://www.youtube.com/watch?v=g8qeaEd2jTc).

public class bubble_sort {
	public int[] bubbleSort(int arr[]) {
		int n = arr.length;
		
		/* Intake the unsorted array. Below are nested for loops. The inner loop is run every time the outer loop advances by 1. In this way, the comparison is made on each element in the array.*/
		
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				
				/* Below is a check and procedure for if the check is true. If "arr[j] > arr[j + 1]", then we swap their values by temporarily housing the value of arr[j] in the temp variable,
				 * moving the value of arr[j + 1] to index arr[j] and putting the value housed in temp back into index arr[j + 1]. This process is repeated until the whole array is sorted.*/
				
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		return arr;
	}
}