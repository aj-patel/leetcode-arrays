/***
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2
 */
package com.aj;

public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = {3,2,3};
		System.out.println(majorityElement(nums));
	}
	
	public static int majorityElement(int[] nums) {
		if(nums ==null) return 0;
		int count=0,temp=nums[0];
		for (int i=1 ;i<nums.length;i++) {
			if(temp==nums[i]) count++;
			else{
				count--;
				if(count==0){
					temp=nums[i];
				}
			}
		}
		return temp;
	}
}
