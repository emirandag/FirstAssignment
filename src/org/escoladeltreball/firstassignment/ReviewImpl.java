/**
 * 
 */
package org.escoladeltreball.firstassignment;

/**
 * @author Pep Méndez
 *
 */
public final class ReviewImpl implements Review {

	/**
	 * 
	 * @param values
	 *            and array of unordered integers
	 * @param n
	 *            the value to check out
	 * @return the frequency of n in values
	 */
	private int frequency(int[] values, int n) {
		int counter = 0;
		for (int value : values) {
			if (n == value) {
				counter++;
			}
		}
		return counter;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.escoladeltreball.firstassignment.Utils#frequencyPercentage(int[],
	 * int)
	 */
	@Override
	public double frequencyPercentage(int[] values, int n) {
		return values.length == 0 ? 0 : ((double) frequency(values, n)) / values.length * 100;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.escoladeltreball.firstassignment.Utils#merge(int[], int)
	 */
	@Override
	public int[] merge(int[] values, int n) {
		int[] merge = new int [values.length+1];
		int i = 0;
		
		while (i < values.length && values[i] <= n) {
			merge[i] = values[i];
			i++;
		}
		
		merge[i] = n;
		for (; i < values.length ; i++) {
			merge[i+1] = values[i];
		}
		return merge;
	}

	/*
	 * This method returns an integer matrix with row 0 holding even numbers and row
	 * 1 holding odd numbers.
	 * 
	 * NOTE: Don't waste space!!!
	 */
	@Override
	public int[][] split(int[] values) {
		int [][] matriz = new int [2][];
		int evenNum = 0 , evenCount = 0, oddNum = 0, oddCount = 0;
		
		for (int value : values) {
			if (value%2==0){
				evenCount++;
			} else {
				oddCount++;
			}
		}
		
			matriz [0] = new int [evenCount];
			matriz [1] = new int [oddCount];
			
			for (int value : values) {
				if (value%2==0) {
					matriz[0][evenNum++] = value;
				} else {
					matriz[1][oddNum++] = value;
				}
			}
		return matriz;
	}
		
	
}
	
