// 5.Swap two numbers without using third variable approach 2.

import java.util.Scanner;

public class Swap2
{
public static void main(String[] args)
{
int x,y;
System.out.print("Enter two number X and Y: ");
Scanner sc = new Scanner(System.in);
x=sc.nextInt();
y=sc.nextInt();

System.out.println("before swapping: " +x+" " +y);
x = x*y;
y = x/y;
x = x/y;

System.out.println("after swapping: " +x+ " " +y);
}
}
 