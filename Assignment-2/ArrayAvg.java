//1.Calculate the average of given array. 

import java.util.Scanner;

class ArrayAvg
{
	static double average(int a[], int n)
	{
		int sum=0;
		for(int i=0; i<n; i++)
		sum=sum+a[i];
		return (double) sum/n;
	}
	public static void main (String[] args)
	{
		int arr[]={20,5,6,7,56,8,9,10,4};
		int n=arr.length;

		System.out.println(average(arr,n));
	}
}



 