package mydata;

import java.util.Scanner;
/*
 * 
 *
n=110
============
i*i---->
2*2= 4
3*3=9
4*4=16
5*5=25
6*6=36
7*7=49
8*8=64
9*9=81
10*10=100
 * 
 */
public class series3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int n,i=1;
		System.out.println("Enter the val of n=");
		n = ob.nextInt();
		
		for(i=1;i*i<n; i++)
		{
			System.out.println(i*i);
		}
	}
}
