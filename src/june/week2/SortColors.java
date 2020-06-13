/*
	Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
	
	Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
	
	Note: You are not suppose to use the library's sort function for this problem.
	
	Example:
	
	Input: [2,0,2,1,1,0]
	Output: [0,0,1,1,2,2]
 */
package june.week2;

public class SortColors {
	public void sortColors(int[] nums) {
		int[] countArray = new int[3];
		for (int num : nums) {
			countArray[num]++;
		}

		int k = 0;
		for (int i = 0; i < countArray.length; i++) {
			for (int j = 0; j < countArray[i]; j++) {
				nums[k] = i;
				k++;
			}
		}
	}
}
