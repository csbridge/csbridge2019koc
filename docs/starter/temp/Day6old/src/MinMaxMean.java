import acm.program.ConsoleProgram;
/*
 * Class: MinMaxMean
 * ----------------- 
 * Exercise for simple array operations
 * The aim is to implement a program that reads a list of numbers from the user
 * and then print max, min and mean of all values entered by the user
 */
public class MinMaxMean extends ConsoleProgram{
	public void run() {
		int numValues=readInt("How many values would you like to input? ");

		/* create the array */
		double[] values = new double[numValues];
		for(int i = 0; i < values.length; i++) {
			values[i] = readDouble("Specify input for index "+i+" :");
		}
		println("Max: " + findMax(values));
		println("Min: " + findMin(values));
		println("Mean: " + findMean(values));
	}
	

	/** Implement the methods below**/

	/* Your task: Implement the method for finding the
	 * maximum of all values in the array*/
	private double findMax(double[] inputArray) {

		return 0;
	}
	
	/* Your task: Implement the method for finding the
	 * minimum of all values in the array*/
	private double findMin(double[] inputArray) {

		return 0;
	}

	/* Your task: Implement the method for finding the
	 * mean of all values in the array*/
	private double findMean(double[] inputArray) {

		return 0;
	}
}
