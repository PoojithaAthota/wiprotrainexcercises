package com.wipro.basic;

public class ArrayProduct {

	public static void main(String[] args) {
		int nums[]= {10,20,30,40,50};
		
		for(int i=0;i<nums.length;i++) {
			nums[i]=nums[i]*2;
		}
		for(int j=0;j<nums.length;j++) {
			System.out.println(nums[j]);
		}

	}

}
