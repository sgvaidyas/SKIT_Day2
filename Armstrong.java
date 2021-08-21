package mydata;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int n,sum=0,num,rem,x;
		System.out.println("Enter the val of n=");
		n = ob.nextInt();
		num = n;
		
		for(;n>0;n=n/10)
		{
			rem=n%10;
			x = (int)Math.pow(rem, 3);
			sum+=x;
		}
		if(sum==num)
			System.out.println("Armstrong num");
		else
			System.out.println("Not armstrong");
	}

}
/*
123

1^3 + 2^3 + 3^3 = 1+8+27 = 36==123 ??->Not armstrong


153
1^3+5^3+3^3 = 1+125+27 = 153==153 -->Armstrong num


n=153=num
	 n%10   x
n    rem    rem^3  sum+=x   new n=n/10
----------------------------------
153   3     27     0+27=27      15
15    5     125    27+125=152   1
1     1     1      152+1=153    0
==========================================

*/