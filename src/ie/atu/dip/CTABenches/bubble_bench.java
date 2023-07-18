package ie.atu.dip.CTABenches;

import ie.atu.dip.CTAControl.random_array_generator;
import ie.atu.dip.CTASorts.bubble_sort;

/*As described in the project report, each sorting algorithm was given a corresponding benchmarking class, in keeping with the Single Responsibility Principle. 
 * The general operation of these benchmarks is commented here in the bubble_bench class, with any specific considerations being commented in other benchmarks where warranted. 
 * The benchmark algorithm itself is adapted from the code given in the project brief.*/

public class bubble_bench {
	public double bubbleBench(int n) {
		random_array_generator random = new random_array_generator();
		bubble_sort bubble = new bubble_sort();
		
		//Number of runs is defined here.
		
		int numRuns = 10;
		
		//An array is created to house the time for each run.
		
		double[] results = new double[numRuns];
		
		//For each benchmark run:
		
		for (int run = 0; run < numRuns; run++) {
			
			//Record start time, in nanoseconds.
			
			long start = System.nanoTime();
			
			//Run the sorting algorithm, with a randomly generated array of values between 1 and 10000, with n elements in the array.
			
			bubble.bubbleSort(random.rAG(n));
			
			//Record the finish time, in nanoseconds.
			
			long stop = System.nanoTime();
			
			//To get the total elapsed time for this run, deduct the start time from the finish time.
			
			long elapsed = stop - start;
			
			//To get the running time in milliseconds, for presenting in the output table, divide the time in nanoseconds by 1000000.
			
			double timeMillis = elapsed / 1000000.0;
			
			//Insert the time for this run into the array.
			
			results[run] = timeMillis;
		}
		
		//Here, we tally all the running times and divide by the number of runs to get an average time, which will be displayed on the results table.
		
		double total = 0;
		for (int i = 0; i < results.length; i++) {
			total = total + results[i];
		}
		double avg = total / results.length;
		// System.out.println(avg);
		return avg;
	}

}
