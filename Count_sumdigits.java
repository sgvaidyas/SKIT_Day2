package mydata;

import java.util.Scanner;

/*
 * 
n=776543

count of digits = 6
sum of digits = 7+7+6+5+4+3
cnt = 0
sum = 0
          
		  =n%10             =n/10
n         rem     cnt++     new=n   sum=sum+rem
------------------------------------------------
776543     3        1       77654       0+3=3
77654      4        2       7765        3+4=7
7765       5        3       776			7+5=12
776        6        4       77			12+6=18
77         7        5       7			18+7=25
7          7        6       0			25+7=32
--------------------------------------------------no of digits   = cnt
sum of digits= sum
 */
public class Count_sumdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int n,cnt=0,sum=0,rem;
		System.out.println("Enter the val of n=");
		n = ob.nextInt();
		// n is already initialized in line 33 ;n>0;n=n/10
		for(;n>0;n=n/10)
		{
			rem = n%10;
			sum = sum + rem;
			cnt++;
		}
		System.out.println("Count of digits = "+ cnt);
		System.out.println("sum  of digits = "+ sum);		
	}
}
