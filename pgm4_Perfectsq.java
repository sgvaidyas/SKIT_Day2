package mydata;

import java.util.Scanner;

public class pgm4_Perfectsq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int n,i=1;
		System.out.println("Enter the val of n=");
		n = ob.nextInt();
		
		double x = Math.sqrt(n);
		System.out.println(x);
/*		System.out.println(Math.ceil(x));
		System.out.println(Math.floor(x));
		System.out.println(Math.round(x));
*/		
		//if(x-Math.floor(x) ==0)
		//if(x-(int)x==0)
		if(x%1==0)
			System.out.println("Perfect square");
		else
			System.out.println("not a perfect square");	
		
	}

}
