// 7.How to check the given number is Positive or Negative in Java?

import java.util.Scanner;
public class PositiveNegative
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number:");
int num=sc.nextInt();

if (num<0)
System.out.print("The number" + num + "is negative");
else
System.out.print("The number" + num + "is positive");
}
}