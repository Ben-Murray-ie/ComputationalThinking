package ie.atu.dip.CTAControl;

import ie.atu.dip.CTABenches.bubble_bench;
import ie.atu.dip.CTABenches.cocktail_bench;
import ie.atu.dip.CTABenches.counting_bench;
import ie.atu.dip.CTABenches.merge_bench;
import ie.atu.dip.CTABenches.quick_bench;

/*This is the main method of the program, where all the results of the sorting algorithms are accessed and output in table format. Each atomic value in the table represents the average of 10 runs of input size n.*/

public class runner {
	public static void main(String[] args) {
		bubble_bench bubble = new bubble_bench();
		counting_bench count = new counting_bench();
		merge_bench merge = new merge_bench();
		quick_bench quick = new quick_bench();
		cocktail_bench cocktail = new cocktail_bench();
		
		System.out.printf("%-20s%-10d%-10d%-10d%-10d%-10d%-10d%-10d%-10d%-10d%-10d%-10d%-10d%-10d\n", "Size (n)", 100, 250, 500, 750, 1000, 1250, 2500, 3750, 5000, 6250, 7500, 8750, 10000);
		System.out.printf("%-20s%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f\n", "Bubble Sort", bubble.bubbleBench(100), bubble.bubbleBench(250), bubble.bubbleBench(500), bubble.bubbleBench(750), bubble.bubbleBench(1000), bubble.bubbleBench(1250), bubble.bubbleBench(2500), bubble.bubbleBench(3750), bubble.bubbleBench(5000), bubble.bubbleBench(6250), bubble.bubbleBench(7500), bubble.bubbleBench(8750), bubble.bubbleBench(10000));
		System.out.printf("%-20s%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f\n", "Merge Sort", merge.mergeBench(100), merge.mergeBench(250), merge.mergeBench(500), merge.mergeBench(750), merge.mergeBench(1000), merge.mergeBench(1250), merge.mergeBench(2500), merge.mergeBench(3750), merge.mergeBench(5000), merge.mergeBench(6250), merge.mergeBench(7500), merge.mergeBench(8750), merge.mergeBench(10000));
		System.out.printf("%-20s%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f\n", "Counting Sort", count.countBench(100), count.countBench(250), count.countBench(500), count.countBench(750), count.countBench(1000), count.countBench(1250), count.countBench(2500), count.countBench(3750), count.countBench(5000), count.countBench(6250), count.countBench(7500), count.countBench(8750), count.countBench(10000));
		System.out.printf("%-20s%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f\n", "Quicksort", quick.quickBench(100), quick.quickBench(250), quick.quickBench(500), quick.quickBench(750), quick.quickBench(1000), quick.quickBench(1250), quick.quickBench(2500), quick.quickBench(3750), quick.quickBench(5000), quick.quickBench(6250), quick.quickBench(7500), quick.quickBench(8750), quick.quickBench(10000));
		System.out.printf("%-20s%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f\n", "Cocktail Sort", cocktail.cocktailBench(100), cocktail.cocktailBench(250), cocktail.cocktailBench(500), cocktail.cocktailBench(750), cocktail.cocktailBench(1000), cocktail.cocktailBench(1250), cocktail.cocktailBench(2500), cocktail.cocktailBench(3750), cocktail.cocktailBench(5000), cocktail.cocktailBench(6250), cocktail.cocktailBench(7500), cocktail.cocktailBench(8750), cocktail.cocktailBench(10000));
		System.out.println("");
		
		//Below I included a second test of Merge and Counting Sorts, to better illustrate their performance on larger sizes of n.
		
		System.out.printf("%-20s%-10d%-10d%-10d%-10d%-10d%-10d%-10d%-10d%-10d%-10d%-10d%-10d%-10d\n", "Size (n)", 10000, 25000, 50000, 75000, 100000, 125000, 250000, 375000, 500000, 625000, 750000, 875000, 1000000);
		System.out.printf("%-20s%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f\n", "Merge Sort", merge.mergeBench(10000), merge.mergeBench(25000), merge.mergeBench(50000), merge.mergeBench(75000), merge.mergeBench(100000), merge.mergeBench(125000), merge.mergeBench(250000), merge.mergeBench(375000), merge.mergeBench(500000), merge.mergeBench(625000), merge.mergeBench(750000), merge.mergeBench(875000), merge.mergeBench(1000000));
		System.out.printf("%-20s%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f%-10.3f", "Counting Sort", count.countBench(10000), count.countBench(25000), count.countBench(50000), count.countBench(75000), count.countBench(100000), count.countBench(125000), count.countBench(250000), count.countBench(375000), count.countBench(500000), count.countBench(625000), count.countBench(750000), count.countBench(875000), count.countBench(1000000));
	}
}