// 19.Check whether the Given Number is a Palindrome or NOT.

import java.util.Scanner;
class Palindrome
{
public static void main(String[] args)
{
int x, y, z=0, temp=0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number:");
y = sc.nextInt();
x = y;

while(y>0)
{
x = y % 10;
y = y / 10;
temp = temp * 10 + x;
}

if(temp == z)
{
System.out.print("The number is Palindrome.");
}
else
System.out.print("The number is not Palindrome.");
}
}
