package com.trl;

public class RichestCustomerWealth {

	// https://leetcode.com/problems/richest-customer-wealth/

	public static int maximumWealth(int[][] accounts) {
		int result = 0;
		for (int i = 0; i < accounts.length; i++) {
			int subResult = 0;
			for (int j = 0; j < accounts[i].length; j++) {
				subResult = subResult + accounts[i][j];
			}
			if (result < subResult) {
				result = subResult;
			}
		}
		return result;
	}
}
