# Computational_Thinking
 Computational Thinking Project - A program to compare the peformance of sorting algorithms.

---

**Description:**
 
This was the first full Java program I created for the H.Dip in Software Development course at ATU. Essentially, it is a testing suite for five different sorting algorithms to determine and compare their Big O time complexity. The selected sorting algorithms were Bubble Sort, Cocktail Shaker Sort, Merge Sort, Quicksort and Counting Sort. The program creates random integer arrays of size n and runs the sorting algorithm 10 times to get an average for each. This process is repeated from, by default, from n = 100 to n = 10000. When all runs are complete, the results are displayed in table format in the console. A second series of tests are run on Merge and Counting sort, where n ranges from 10000 to 1000000. This test was included to help illustrate their performance on a graph in the report that was generated from this project. 

---

**Instructions:**

* Verify Java installation (Command Prompt -> "java -version").
* Navigate to src folder.
* Compile to bytecode (javac ie\atu\dip\CTAControl\runner.java).
* Run the program (java ie.atu.dip.CTAControl.runner).
* Program will run sorting algorithms on random data sets of size n and display results in a table (shown below).
* Additional runs are included for Merge and Counting sort (to improve visibility when graphed).

---

**Example output:**

![Sorting_Comparison_Example](screencaps/Example_output.png)
