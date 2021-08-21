package mydata;


/*
 * 
 * 
n = 6


1  4  7  10  13 16

starting term = 1

no of terms = 6

cnt     i  new i new cnt
---------------------
1<=6    1   4     2
2<=6    4   7     3
3<=6    7   10    4

 */












import java.util.Scanner;

public class MyClass1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int n,i=1,cnt=1;
		System.out.println("Enter the val of n=");
		n = ob.nextInt();
		
		while(cnt<=n)
		{
			System.out.println(i);
			i+=3;
			cnt++;
		}
		/*
		 for(cnt=1;cnt<=n;cnt++)
		 {
		 	System.out.println(i);
			i+=3;
		  }
		 */		
	}
}
