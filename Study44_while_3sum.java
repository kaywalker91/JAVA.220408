package Study0408;

public class Study44_while_3sum 
{

	public static void main(String[] args) 
	{
		int i = 1;
		int sum = 0;
		
		while (i <= 1000)
		{
			sum = sum + (3*i);
			i++;
		}
		System.out.println(sum);
	}

}
