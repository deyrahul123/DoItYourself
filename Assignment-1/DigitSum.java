// 12.Write a Java Program to find sum of the digits of a given number. 

import java.util.Scanner;  
public class DigitSum   
{  
public static void main(String args[])  
{  
int x, y, sum = 0;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");  
x = sc.nextInt();  
while(x > 0)  
{  
y = x % 10;  
sum = sum + y;  
x = x / 10;  
}  
System.out.println("Sum of Digits: "+sum);  
}  
}