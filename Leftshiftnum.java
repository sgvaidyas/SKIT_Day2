package mydata;
/*
 * 
5678->6785
-----------------------------------------
n= 5678

noofdig=4

temp = 10^noofdigit-1 = 1000

x = num%temp = 5678%1000= 678
y = num/temp = 5678/1000= 5

n = x*10+y= 678*10+5= 6780+5 = 6785

-----------------------------------------------
 */

import java.util.Scanner;

public class Leftshiftnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			int temp = (int)Math.pow(10,nodig-shifts);
			int x = num%temp;
			int y= num/temp;
			n = x*((int)Math.pow(10,shifts))+y;
			System.out.println("Left shifted value = " + n);			
		}		
	}
}
/*
n=
12345  shifts=3
-----------------------------------------
n= 12345

noofdig= 5
shifts = 3

temp = 10^noofdigit-shifts = 10^(5-3)=100

x = num%temp = 12345%100= 45
y = num/temp = 12345/100= 123

n = x*(10^shifts)+y= 45*10^3 + y= 45000+123=45123

-----------------------------------------------
*/