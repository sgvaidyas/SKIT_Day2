package mydata;

import java.util.Scanner;

/*
 * 5*5 = 25
 * 25*25= 625
 * 6*6=36
 */
public class Automorphicnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int n,nodig=0,num,square,lastdigs,x;
		System.out.println("Enter the val of n=");
		n = ob.nextInt();
		num = n;
		for(;n>0; n=n/10)
		{
			nodig++;
		}
		square = num*num;
		lastdigs = square%((int)Math.pow(10,nodig));
		if(lastdigs==num)
			System.out.println("Automorphic");
		else
			System.out.println("NOT Automorphic");
		
	}

}
/*
n = 25

nod = 2

square = n*n 
	   = 625


lastdigs = square%(10^nod)= 625%100=25

if(lastdigs==num)-->Automorphic

*/