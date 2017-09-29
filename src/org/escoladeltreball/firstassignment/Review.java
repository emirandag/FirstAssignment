/**
 * 
 */
package org.escoladeltreball.firstassignment;

/**
 * @author Pep Mendez
 *
 */
public interface Review {

	/*
	 * This method returns an integer matrix with row 0 holding even numbers and
	 * row 1 holding odd numbers.
	 * 
	 * NOTE: Don't waste space!!!
	 */
	public abstract int[][] split(int[] values);

	/*
	 * This method returns an integer array with n in its place.
	 * 
	 * NOTE: values is an ordered array
	 */
	public abstract int[] merge(int[] values, int n);

	/*
	 * This method returns the frequency in % of n in values
	 */
	public abstract double frequencyPercentage(int[] values, int n);

	/*
	 * This method returns the average (in position 0) and the standard
	 * deviation (in position 1) from a sample
	 */
	public abstract double[] basicStatistics(double[] values);
}
