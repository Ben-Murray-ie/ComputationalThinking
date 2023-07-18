package ie.atu.dip.CTABenches;

import ie.atu.dip.CTAControl.random_array_generator;
import ie.atu.dip.CTASorts.quicksort;

public class quick_bench {
	public double quickBench(int n) {
		random_array_generator random = new random_array_generator();
		quicksort quick = new quicksort();
		int[] input = random.rAG(n);
		int numRuns = 10;
		double[] results = new double[numRuns];
		for (int run = 0; run < numRuns; run++) {
			long start = System.nanoTime();
			quick.quickSort(input, 0, input.length - 1);
			long stop = System.nanoTime();
			long elapsed = stop - start;
			double timeMillis = elapsed / 1000000.0;
			results[run] = timeMillis;
		}
		double total = 0;
		for (int i = 0; i < results.length; i++) {
			total = total + results[i];
		}
		double avg = total / results.length;
		//System.out.println(avg);
		return avg;
	}
}
