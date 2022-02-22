// 9.Write a Java Program to Print 1 To 10 Without Using Loop. 

import java.util.Scanner;
public class Print
{
public static void RecursivePrint(int x)			// by using Recursion
{
if (x<=10)
{
System.out.println(x);
RecursivePrint(x+1);
}
}
public static void main(String[] args)
{
RecursivePrint(1);
}
}
