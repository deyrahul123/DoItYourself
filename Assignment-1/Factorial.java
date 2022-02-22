//2.Write a Java Program to find the Factorial of given number.

import java.util.Scanner;
public class Factorial
{
public static void main(String[] args)
{
int x;
int y = 1;
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number:");
int num=sc.nextInt();
for(x=1; x<=num; x++)
{
y=y*x; 		
}
System.out.print("The factorial of number" + num + "is:" +y);
}
}+
