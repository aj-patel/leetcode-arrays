/***
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
package com.aj;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 7, 11, 15};
		int target = 4;
		System.out.println(Arrays.toString(twoSum(nums, target)));

		
	}
	
	public static int[] twoSum(int[] nums, int target){
		Map<Integer, Integer> map = new HashMap<>();
		int[] EMPTY_ARRAY={};
		for(int i=0;i<nums.length ;i++){
			if(map.get(target-nums[i]) !=null){
				return new int[] {map.get(target-nums[i]),i};
			}else{
				map.put(nums[i],i);
			}
		}
		return EMPTY_ARRAY;
	}

}
