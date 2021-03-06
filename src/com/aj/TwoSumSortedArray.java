/***
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.
Example:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */
package com.aj;

import java.util.Arrays;

public class TwoSumSortedArray {

	public static void main(String[] args) {
		int[] numbers = {2,7,11,15};
		int target = 19;
		System.out.println(Arrays.toString(twoSum(numbers, target)));
	}
	
	public static int[] twoSum(int[] numbers, int target) {
		int startIndex=0, endIndex = numbers.length-1;
		int[] result = {0,0};
		int[] EMPTY_ARRAY={};
		while(startIndex<endIndex){
			if(target==numbers[startIndex]+numbers[endIndex]){
				result[0]=startIndex;
				result[1]=endIndex;
				return result;
			}
			if(target> numbers[startIndex]+numbers[endIndex]){
				startIndex++;
			}
			else{
				endIndex--;
			}
		}
	return EMPTY_ARRAY;
	}
}
