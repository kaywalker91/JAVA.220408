package Study0408;

public class Study40_for_for_for 
{

	public static void main(String[] args) 
	{
		int i,j;
		
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=5-i; j++)
			{
				System.out.print(" ");
			}
			for(j=1; j<=2*i-1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
