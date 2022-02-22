// 8.Write a Java Program to find whether given number is Leap year or NOT?

import java.util.Scanner;
public class LeapYear
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a year: ");
int x = sc.nextInt();
if (x % 4==0 || x % 400==0)
System.out.print("The year" +x+ "is a leap year.");
else 
System.out.print("The year" +x+ "is not a leap year.");
}
}