package com.wipro.basic;

public class Arrays3 {
	public static void main(String[] args) {
		int[] arr= {2, 7, 11, 15};
	    int target=9;
	    int[] output= {0,0};
	    
		System.out.print("Heere");
		for(int i=0;i<arr.length;i++)
		{
			if(((i+1)<arr.length)&&(arr[i]+arr[i+1]==target))
			{
				
				System.out.print("Heere");
				output[0]=i;
				output[1]=i+1;
			}
			
		}
	
		System.out.println(output[0]+output[1]);
	}
}


