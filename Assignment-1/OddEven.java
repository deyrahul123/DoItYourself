//1.Check the given number is EVEN or ODD.

import java.util.Scanner;
public class OddEven
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a random number:");
int num= sc.nextInt();

if (num % 2==0)
System.out.println("The number" +num+ "is even.");
else
System.out.println("The number" +num+ "is odd.");
}
}