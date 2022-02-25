// 2.Find the second largest number in the given array.

import java.util.*;
class ArraySecond
{

static void print2largest(int arr[], int m)
{
int i, first, second;

if (m < 2)
{
	System.out.print(" Invalid Input ");
	return;
}

Arrays.sort(arr);

for (i = m - 2; i >= 0; i--)
{
	if (arr[i] != arr[m - 1])
	{
	System.out.println("The second largest element is "+ arr[i]);
	return;
	}
}

System.out.println("There is no second largest element\n");
}

public static void main(String[] args)
{
int arr[] = {12, 35, 1, 10, 34, 1};
int n = arr.length;
print2largest(arr, n);
}
}


