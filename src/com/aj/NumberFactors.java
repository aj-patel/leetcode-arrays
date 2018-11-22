/***
 * Write a program which will find factors of given number and find whether the factor is even or odd.
 */

package com.aj;

import java.util.ArrayList;
import java.util.List;

public class NumberFactors {

	public static void main(String[] args) {
		System.out.println(factors(16));
	}
	
	public static List<Integer> factors(int number){
		List<Integer> list = new ArrayList<>();
		for(int i=1 ;i<=Math.sqrt(number); i++){
			if(number %i ==0){
				list.add(number/i);
				if(i != Math.sqrt(number)){
					list.add(i);
				}
			}
		}
		return list;
	}
	
	
}
