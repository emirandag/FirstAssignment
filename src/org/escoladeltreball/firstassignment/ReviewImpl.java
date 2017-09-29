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
		
		int[] result = new int[values.length + 1];
		int i = 0;
		
		while (i < values.length && values[i] <= n) {
			result[i] = values[i];
			i++;
		}
		result[i] = n;
		for(;i<values.length;i++) {
			result[i + 1] = values[i];
		}	
	
		return result;
		
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
		int par = 0;
		int impar = 0;
		int parcount =  0;
		int imparcount = 0;
		
		for (int i = 0 ; i < values.length; i++) {
			if (values[i]%2==0){
				parcount++;
				
			} else {
				imparcount++;
				
			}
		}
		matriz[0] = new int [parcount];
		matriz[1] = new int [imparcount];
		for (int i = 0 ; i < values.length; i++) {
			if (values[i]%2==0){
				
				matriz[0][par++] = values[i];
			} else {
				
				matriz[1][impar++] = values[i];
			}
		}
			
		return matriz;
	}
		
	
}
	
