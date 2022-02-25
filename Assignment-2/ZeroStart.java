// 11.Write a Java Program to Move all Zeros to Start of the Array. 

import java.util.*;

class ZeroStart
{

static void printArr(int arr[], int n)
{
	for (int i = 0; i < n; i++)
		System.out.print(arr[i]+" ");
}


static void pushZeroToStart(int arr[], int n)
{

	int count = 0;

	for (int i = 0; i < n; i++)
		if (arr[i] != 1)
			arr[count++] = arr[i];

	while (count < n)
		arr[count++] = 1;

	int a = 0;

	for (int i = n - 1; i >= 0; i--)
	{		
		if (arr[i] == 1)
			continue;
		if (a == 0)
		{			
			a = i;
		}

		if (arr[i] != 0)
			arr[a--] = arr[i];
	}

	while (a >= 0)
		arr[a--] = 0;
}

	public static void main(String[] args)
	{
		int arr[] = { 8, 5, 0, 0, 7, 0, 6 };
		int n = arr.length;
		pushZeroToStart(arr, n);
		printArr(arr, n);

	}
}



		
			