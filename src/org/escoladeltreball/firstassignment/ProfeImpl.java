/**
 * 
 */
package org.escoladeltreball.firstassignment;

/**
 * @author Pep Méndez
 * 
 *         This solution has been successfully tested against all tests
 *         initially present in the <b>ReviewImplTest</b> class, but it might
 *         fail under certain circumstances. Nevertheless, it might contains
 *         undetected bugs. Should it be the case, your feedback and comments
 *         are more than welcome.
 *
 */
public class ProfeImpl implements Review {

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
	 * @see org.escoladeltreball.firstassignment.Review#split(int[])
	 */
	@Override
	public int[][] split(int[] values) {
		int[][] matrix = new int[2][];
		int evenNumbersCounter = 0, oddNumbersCounter = 0;
		int evenNumbersIndex = 0, oddNumbersIndex = 0;
		for (int value : values) {
			if (value % 2 == 0) {
				evenNumbersCounter++;
			} else {
				oddNumbersCounter++;
			}
		}
		matrix[0] = new int[evenNumbersCounter];
		matrix[1] = new int[oddNumbersCounter];
		for (int value : values) {
			if (value % 2 == 0) {
				matrix[0][evenNumbersIndex++] = value;
			} else {
				matrix[1][oddNumbersIndex++] = value;
			}
		}
		return matrix;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.escoladeltreball.firstassignment.Review#merge(int[], int)
	 */
	@Override
	public int[] merge(int[] values, int n) {
		int[] merged = new int[values.length + 1];
		int i = 0;
		while (i < values.length && values[i] <= n) {
			merged[i] = values[i];
			i++;
		}
		merged[i] = n;
		for (; i < values.length; i++) {
			merged[i + 1] = values[i];
		}
		return merged;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.escoladeltreball.firstassignment.Review#frequencyPercentage(int[],
	 * int)
	 */
	@Override
	public double frequencyPercentage(int[] values, int n) {
		return values.length == 0 ? 0 : ((double) frequency(values, n)) / values.length * 100;
	}

	@Override
	public double[] basicStatistics(double[] values) {
		double[] ret = new double[2];
		for (double value: values) {
			ret[0] += value;
		}
		ret[0] /= values.length;
		for (double value: values) {
			ret[1] += Math.pow(value - ret[0] , 2);
		}
		ret[1] = Math.sqrt(ret[1] / values.length);
		return ret;
	}

}
