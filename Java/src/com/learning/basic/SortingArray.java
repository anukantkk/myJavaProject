//[2/8/16, 11:44 AM] Madhur Yadav (madhursonu@gmail.com):  Given an array of integers, sort the integer values.
package com.learning.basic;

public class SortingArray {

	public static void main(String[] args) {
		ArrSorting();
		
	}
	
	public  static void ArrSorting(){
		int i,j,temp;
		int[] arr = {2,1,4,3,6,7,9,5,6,8};
		for(i=0; i<arr.length-1; i++)
		{
			for(j=i+1;j<arr.length-1; j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			
		}System.out.println(arr[i]);
		


	}
		
		
}
}
