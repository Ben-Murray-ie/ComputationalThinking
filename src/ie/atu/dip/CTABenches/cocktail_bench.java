package ie.atu.dip.CTABenches;

import ie.atu.dip.CTAControl.random_array_generator;
import ie.atu.dip.CTASorts.cocktail_sort;

public class cocktail_bench {
	public double cocktailBench(int n) {
		random_array_generator random = new random_array_generator();
		cocktail_sort cocktail = new cocktail_sort();
		int numRuns = 10;
		double[] results = new double[numRuns];
		for (int run = 0; run < numRuns; run++) {
			long start = System.nanoTime();
			cocktail.cocktailSort(random.rAG(n));
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
		// System.out.println(avg);
		return avg;
	}
}
