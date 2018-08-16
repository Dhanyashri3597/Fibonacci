import java.util.Scanner;
import java.io.*
;

public class Fibonaci{
int i;
	public int fibonaci(int n)
	{
		
		for(i=0;i<n;i++)
		{
			if(n==0)
			return 0;
			else if(n==1)
				return 1;
			else
				return fibonaci(n-1)+fibonaci(n-2);
					}
		return n;
			
	}

	public static void main(String[] args) {

		Scanner s=new Scanner (System.in);
		System.out.println("enter the number:");
		int n;
		n=s.nextInt();
		Fibonaci f=new Fibonaci();
		n=f.fibonaci(n);
	System.out.println(n);
		
}

	
	}

	
