package ie.atu.dip.CTAControl;

//Reference: Tutorialspoint.com (https://www.tutorialspoint.com/generate-a-random-array-of-integers-in-java).

import java.util.Random;

public class random_array_generator {
	public int[] rAG(int num) {
		
		// Using the Java utility library, create a new random object.
		
		Random rd = new Random();
		
		// Create a new array of size n, where num = n. Populate the array with random integers between 1 and 10000. 
		
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(10000); 
		}
		//System.out.println(Arrays.toString(arr));
		return arr;
	}

	/*Below is a modified Random Array Generator to be used with the counting sort implementation. Due to counting sort's "classification" component, the range of random numbers to randomly select within must be limited.*/
	
	public int[] rAGcount(int num) {
		Random rd = new Random();
		int[] arr = new int[num];
		
		// Use the same procedure as above, but limit the range of random integers to between 1 and 256.
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(256); 
		}
		//System.out.println(Arrays.toString(arr));
		return arr;
	}
}
