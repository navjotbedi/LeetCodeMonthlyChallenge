/**
	Given a set of distinct positive integers, find the largest subset such that every pair (Si, Sj) of elements in this subset satisfies:
	
	Si % Sj = 0 or Sj % Si = 0.
	
	If there are multiple solutions, return any subset is fine.
	
	Example 1:
	
	Input: [1,2,3]
	Output: [1,2] (of course, [1,3] will also be ok)
	Example 2:
	
	Input: [1,2,4,8]
	Output: [1,2,4,8]
 */
package june.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {
	public List<Integer> largestDivisibleSubset(int[] nums) {

		if (nums == null || nums.length == 0)
			return new ArrayList<>();

		int n = nums.length;

		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < n; i++)
			list.add(new ArrayList<>());

		Arrays.sort(nums);

		for (int i = 0; i < n; ++i) {
			List<Integer> maxSubset = new ArrayList<>();
			for (int j = i - 1; j >= 0; j--) {
				if (nums[i] % nums[j] == 0 && maxSubset.size() < list.get(j).size())
					maxSubset = list.get(j);
			}

			list.get(i).addAll(maxSubset);
			list.get(i).add(nums[i]);
		}

		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < n; ++i) {
			if (res.size() < list.get(i).size())
				res = list.get(i);
		}

		return res;
	}
}
