/***
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */
package com.aj;

import java.util.Arrays;

public class MoveZeros {
	
	public static void main(String[] args) {
		int[] input = {10,20,40,30,60};
		moveZeroesOptimized(input);
		System.out.println(Arrays.toString(input));
	}
	
	public static void moveZeroes(int[] nums) {
		int zeroIndex=0;
		if(nums==null) return;
		for(int i=0;i<nums.length;i++){
		if(nums[i] !=0){
				nums[zeroIndex]=nums[i];
				zeroIndex++;
			}
		}
		for(int i=zeroIndex;i<nums.length;i++){
			nums[i]=0;
		}
	}
	
	public static void moveZeroesOptimized(int[] nums) {
		int zeroIndex=0;
		if(nums==null) return;
		int temp=0;
		for(int i=0;i<nums.length;i++){
		if(nums[i] !=0){
				temp = nums[i];
				nums[i]=nums[zeroIndex];
				nums[zeroIndex]=temp;
				zeroIndex++;
			}
		}
	}
	
}
