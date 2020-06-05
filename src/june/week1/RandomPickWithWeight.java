/**
	Given an array w of positive integers, where w[i] describes the weight of index i, write a function pickIndex which randomly picks an index in proportion to its weight.
	
	Note:
	
	1 <= w.length <= 10000
	1 <= w[i] <= 10^5
	pickIndex will be called at most 10000 times.
	Example 1:
	
	Input: 
	["Solution","pickIndex"]
	[[[1]],[]]
	Output: [null,0]
	Example 2:
	
	Input: 
	["Solution","pickIndex","pickIndex","pickIndex","pickIndex","pickIndex"]
	[[[1,3]],[],[],[],[],[]]
	Output: [null,0,1,1,1,0]
	Explanation of Input Syntax:
	
	The input is two lists: the subroutines called and their arguments. Solution's constructor has one argument, the array w. pickIndex has no arguments. Arguments are always wrapped with a list, even if there aren't any.
 */
package june.week1;

import java.util.Arrays;

public class RandomPickWithWeight {

	class Solution {
		private double[] probabilities;

		public Solution(int[] w) {
			double totalWeight = 0;
			probabilities = new double[w.length];
			for (int weight : w) {
				totalWeight += weight;
			}
			for (int i = 0; i < w.length; i++) {
				w[i] += (i == 0) ? 0 : w[i - 1];
				probabilities[i] = w[i] / totalWeight;
			}
		}

		public int pickIndex() {
			return Math.abs(Arrays.binarySearch(probabilities, Math.random())) - 1;
		}
	}

	/**
	 * Your Solution object will be instantiated and called as such: Solution obj =
	 * new Solution(w); int param_1 = obj.pickIndex();
	 */

}
