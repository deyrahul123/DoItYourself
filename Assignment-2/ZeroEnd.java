// 10.Write a Java Program to Move all Zero to End of the Array.

class ZeroEnd
{
	static void pushZerosToEnd(int arr[], int n)
	{
		int count = 0; 
		
		for (int i = 0; i < n; i++)
			if (arr[i] != 0)
				arr[count++] = arr[i]; 
		
		while (count < n)
			arr[count++] = 0;
	}

	public static void main (String[] args)
	{
		int arr[] = {1, 2, 3, 4, 0, 0, 2, 8, 0, 5, 0, 7};
		int n = arr.length;
		pushZerosToEnd(arr, n);
		System.out.println("Array after pushing zeros to the end: ");
		for (int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
	}
}

