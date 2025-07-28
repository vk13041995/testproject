package com.example.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LcCommonCode {

	public static int minSubArrayLen(int target, int[] nums) {
	    int left = 0, sum = 0, minLength = Integer.MAX_VALUE;

	    for (int right = 0; right < nums.length; right++) {
	        sum += nums[right];

	        while (sum >= target) {
	            minLength = Math.min(minLength, right - left + 1);
	            sum -= nums[left];
	            left++;
	        }
	    }

	    return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
	}
	
	
	
//		Input: prices = [7,1,5,3,6,4]
//		Output: 5
//		Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//		Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//		Example 2:
//
//		Input: prices = [7,6,4,3,1]
//		Output: 0
//		Explanation: In this case, no transactions are done and the max profit = 0.
		 
	
	
//	public static int Stock1(int[] prices) {
//		int profit = 0;
//		for (int j = 0; j < prices.length-1; j++) {
//			for (int i = j+1; i < prices.length-1; i++) {
//				if (profit < prices[i] - prices[j]) {
//					profit = prices[i] - prices[j];
//				}
//			}
//		}
//
//		return profit;
//	}
	
	
//	public static int Stock121(int[] prices) {
//	    int minPrice = Integer.MAX_VALUE;
//	    int maxProfit = 0;
//
//	    for (int price : prices) {
//	        minPrice = Math.min(minPrice, price);
//	        maxProfit = Math.max(maxProfit, price - minPrice);
//	    }
//
//	    return maxProfit;
//	}
	
	public static int Stock121(int[] prices) {
	    int[] min = {Integer.MAX_VALUE};
	    return IntStream.of(prices)
	                    .map(price -> {
	                        min[0] = Math.min(min[0], price);
	                        return price - min[0];
	                    })
	                    .max()
	                    .orElse(0);
	}

	
	
//	Input: k = 2, prices = [3,2,6,5,0,3]
//			Output: 7
//			Explanation: Buy on day 2 (price = 2) and sell on day 3 (price = 6), profit = 6-2 = 4. Then buy on day 5 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
//			 
	
	
	public static int Stock188(int[] prices) {
	    int minPrice = Integer.MAX_VALUE;
	    int maxProfit = 0;
	    int res=0;
	    int j=0;

//		for (int price : prices) {
	    for ( int i=j ; i<prices.length;i++) {
			minPrice = Math.min(minPrice, prices[i]);
			if (maxProfit < prices[i] - minPrice) {
				maxProfit = res+ prices[i] - minPrice;
				j=i;
				minPrice = Integer.MAX_VALUE;
				res=maxProfit;
				maxProfit=0;
			}
		}

	    return res;
	}
	
	
	
	
	public static void main(String[] args) {
//		int[] n= {7,1,5,3,6,4};
//		int[] n= {2,4,1};
		int[] n= {3,2,6,5,0,3};
//		int[] n= {7,6,4,3,1};
//		System.out.println(minSubArrayLen(7, n));
		
		System.out.println(Stock121(n));
//		System.out.println(Stock188(n));
	}
}
