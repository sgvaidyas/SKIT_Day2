package mydata;

import java.util.Scanner;

public class Perfectsqwithoutsqroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int n,i=1,flag=0;
		System.out.println("Enter the val of n=");
		n = ob.nextInt();
		
		for(i=1;i*i<=n;i++)
		{
			if(i*i==n)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("NOT Perf sq");
		else
			System.out.println("per sq");
		
	}

}
