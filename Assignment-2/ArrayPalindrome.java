//18.Write a java program to check Given String is Palindrome or NOT.

import java.util.Scanner;
class ArrayPalindrome
{
	public static void main(String[] args)
	{
		String a,b = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		a = sc.nextLine();

		int c = a.length();

		for (int i= c-1; i>=0; i--)
		b = b+a.charAt(i);

		if(b.equals(a))
		System.out.println(a+" is a palindrome");
		else
		System.out.println(a+" is not a palindrome");
	}
}