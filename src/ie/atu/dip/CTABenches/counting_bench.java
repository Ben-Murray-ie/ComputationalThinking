package ie.atu.dip.CTABenches;

import ie.atu.dip.CTAControl.random_array_generator;
import ie.atu.dip.CTASorts.counting_sort;

//As mentioned in the random array generator class, this benchmarking class calls the rAGcount method, which limits the range of potential values to 256, rather than 10000.

public class counting_bench {
	public double countBench(int n) {
		random_array_generator random = new random_array_generator();
		counting_sort count = new counting_sort();
		int numRuns = 10;
		double[] results = new double[numRuns];
		for (int run = 0; run < numRuns; run++) {
			long start = System.nanoTime();
			count.countingSort(random.rAGcount(n));
			long stop = System.nanoTime();
			long elapsed = stop - start;
			double timeMillis = elapsed / 1000000.0;
			results[run] = timeMillis;
		}
		double total = 0;
		for (int i = 0; i < results.length; i++) {
			total = total + results[i];
		}
		// System.out.println(total);
		double avg = total / results.length;
		return avg;
	}

}
