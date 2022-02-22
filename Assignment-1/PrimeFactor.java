// 20. Write a java program to print all the Prime factors of a given number.

import java.util.*;
import java.util.Scanner;
import java.lang.Math;

class Prime
{
public static void PrimeFactors(int x)
{
while(x % 2 == 0)
{
System.out.print(2 + "");
n = n/2;
}
for(int i = 3; i < Math.sqrt(x); i+=2)
{
while(x % i == 0)
{
System.out.print(i + "");
x = x+i;
}
}
if(x > 2)
System.out.print(x);
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int x = sc.nextInt();
PrimeFactor(x);
}
}