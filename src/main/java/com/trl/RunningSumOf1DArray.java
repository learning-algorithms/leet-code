package com.trl;

public class RunningSumOf1DArray {

	// https://leetcode.com/problems/running-sum-of-1d-array/

	public static int[] runningSum(int[] nums) {
		if (null != nums && nums.length > 0) {
			int[] result = new int[nums.length];
			for (int i = 0; i < nums.length; i++) {
				result[i] = getSum(i, nums);
			}
			return result;
		}


		return new int[0];
	}

	static int getSum(final int index, final int[] nums) {
		int result = 0;
		for (int i = index; i >= 0; i--) {
			result = result + nums[i];
		}

		return result;
	}

}
