package mydata;

import java.util.Scanner;
/*
 * 
i=1
i   i=i*2
--------------------------
1     2
2     4
4     8
8     16
16    32
32    64

 */
public class series2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int n,i=1,cnt=1;
		System.out.println("Enter the val of n=");
		n = ob.nextInt();
		
		for(cnt=1;cnt<=n;cnt++)
		{
			//System.out.println(i);
			//i*=2;
			System.out.println(Math.pow(2, cnt-1));			
		}		
	}

}
