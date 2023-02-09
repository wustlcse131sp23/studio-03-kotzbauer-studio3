package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a positive integer so the program will find all prime numbers before it: ");
		int n = in.nextInt();
		if (n <=0)
		{	
			while (n <=0)
			{
				System.out.print("Choose a postive integer: ");
				n = in.nextInt();
			}
		}
		boolean primeTrue = true;
		int[] nList = new int[n];
		for (int i=0; i < nList.length; i++)
		{
			nList[i] = i+1;
		}
		nList[0] = 0;
		for (int number = 2; (number*number) <= nList.length + 1; number++)
		{
			for (int j=2; (j * number) <= nList.length ; j++)
				nList[((number*j) - 1)] = 0;
		}
		
		System.out.println("These are the prime numbers under n (including n): ");
		for (int prime = 0; prime < nList.length; prime++)
		{
			if (nList[prime] != 0)
				System.out.print( nList[prime] + ", ");
		}		
	}

}
