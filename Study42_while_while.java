package Study0408;

public class Study42_while_while 
{

	public static void main(String[] args) 
	{
		int i = 2;
		int j = 1;
		
		while (i < 10) 
		{
			
			while (j < 10)
			{
				System.out.println(i + "x" + j + "=" + i*j);
				j++;
			}
			i++;
			j = 1;
		}
		
	}

}
