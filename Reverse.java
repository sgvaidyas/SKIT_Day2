package mydata;

import java.util.Scanner;

/*
 * n=776543


rev = 0         
		  =n%10          =n/10
n         rem            new=n      rev*10 +rem
------------------------------------------------
776543     3               77654    0+3 = 3 
77654      4               7765     3*10+4 = 34
7765       5               776	    340+5=345
776        6               77		3450+6=3456	
77         7               7		34560+7=34567	
7          7               0		345670+7=345677	
--------------------------------------------------
rev = 345677
 */
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int n,rev=0,rem,num;
		System.out.println("Enter the val of n=");
		n = ob.nextInt();
		num =n;
		// n is already initialized in line 33 ;n>0;n=n/10
		for(;n>0;n=n/10)
		{
			rem = n%10;
			rev = (rev*10) + rem;
		}
		System.out.println("reveresed num = "+ rev);
		if(rev==num)
			System.out.println("Palindrome");
		else
			System.out.println("not palindrome");
		
	}

}
