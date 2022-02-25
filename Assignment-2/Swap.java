// 19.How to Swap two Strings without using third (temporary) variable? 

import java.util.*;

class Swap
{
	public static void main(String[] args)
	{
		String a = "CDAC";
		String b = "JUHU";
		System.out.println("string before swap: a= " +a+ " and b= "+b);
			
		a = a+b;
			
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
			
		System.out.println("string after swap: a= " +a+ " and b= "+b);
	}
}
