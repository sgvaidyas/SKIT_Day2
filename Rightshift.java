package mydata;

import java.util.Scanner;

public class Rightshift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int n,nodig=0,num,shifts;
		System.out.println("Enter the val of n=");
		n = ob.nextInt();
		System.out.println("Enter the val of shifts =");
		shifts = ob.nextInt();
		if(n==0)
			System.out.println(0);
		else
		{
			num = n;
			for(;n>0; n=n/10)
			{
				nodig++;
			}
			shifts = shifts%nodig;
			int z=(int)Math.pow(10, shifts);
			int x = num%z;
	        int y = num/z;
			n = (x*(int)Math.pow(10, nodig-shifts))+y;
			System.out.println(" no of shifts ="+n);
		}
	}

}

/*
 * 
 * n=12345   --->  51234-->45123
shifts 2
=============================
shifts = shifts%nodig

x = n%100 = 12345%100= 45
y = n/100 = 12345/100= 123

n = x*10^(nodig-shifts)+y
  = 45*10^(5-2)+123=> 45123
  
  */
