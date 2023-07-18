package ie.atu.dip.CTASorts;

//References: Geeksforgeeks.com (https://www.geeksforgeeks.org/counting-sort/) & CS Dojo (https://www.youtube.com/watch?v=OKd534EWcdk).

//To make the results of the benchmark more comparable, this algorithm was adapted from sorting chars lexicographically to sorting ints.

/*As described in the comments of the random_array_generator class, this type of sorting algorithm has a mechanism where each distinct value in the array is "classified" into k number of categories.
 * Therefore, the range of random ints which can be assigned to the indices of this algorithm has been limited to 256, rather than 10000 used in all other benchmarked algorithms in this program.*/

public class counting_sort {
	public int[] countingSort(int arr[]) {
		int n = arr.length;

		//Initialise an output array to house the sorted elements.
		
		int output[] = new int[n];

		//Initialise a second array with indices to represent each distinct value of elements found in the input array.
		
		int count[] = new int[256];
		for (int i = 0; i < 256; ++i)
			count[i] = 0;

		//Loop through the input array, incrementing the count of each distinct value as it is encountered.
		
		for (int i = 0; i < n; ++i)
			++count[arr[i]];

		/*Loop over the array of categorised values, adding the value to the left to the current value. This will indicate how many indices should be populated before the current value (or values) 
		 * are added to the output array.*/
		
		for (int i = 1; i <= 255; ++i)
			count[i] += count[i - 1];

		//Here we generate the output array, in reverse order to preserve the stability of the sort.
		
		for (int i = n - 1; i >= 0; i--) {
			output[count[arr[i]] - 1] = arr[i];
			--count[arr[i]];
		}

		//Overwrite the input array with the sorted values of the output array and return.
		
		for (int i = 0; i < n; ++i) {
			arr[i] = output[i];}
		return arr;
	}
}