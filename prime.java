import java.util.Scanner;


public class prime {

	public static void main(String[] args) {
		
		int res=0;
		
		for(int i=2;i<=100;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(j%i==0)
				{
					res=res+i;
					while(res>=100)
					{
						System.out.println("attained sum of prime as 100");
						break;
					}
				}
			}
		}
		
		
	}
}
