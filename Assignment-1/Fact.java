// Factorial
import java.util.Scanner;

class Fact
{  
 public static void main(String args[])
 {  
  int n,fact=1;  
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a number:");
	n=sc.nextInt();
	
  for(int i=1;i<=n ;i++)
  {    
      fact=fact*i;    
  }    
  System.out.println("Factorial: "+fact);    
 }  
}  