/*
	Given an integer, write a function to determine if it is a power of two.
	
	Example 1:
	
	Input: 1
	Output: true 
	Explanation: 20 = 1
	Example 2:
	
	Input: 16
	Output: true
	Explanation: 24 = 16
	Example 3:
	
	Input: 218
	Output: false
 */
package june.week2;

public class PowerofTwo {

	public boolean isPowerOfTwo(int n) {
		return isPowerRec(n);
	}

	private boolean isPowerRec(int n) {
		if (n == 1)
			return true;
		else if (n < 1 || n % 2 != 0)
			return false;
		return isPowerRec(n / 2);
	}

}
