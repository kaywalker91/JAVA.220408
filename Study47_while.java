package Study0408;

public class Study47_while 
{

	public static void main(String[] args) 
	{
		//1000 미만의 자연수에서 3의 배수와 5의 배수의 총합을 구하라.
		int i =1;
		int sum = 0;
		
		while (i < 1000)
		{
			sum = sum + (3*i) + (5*i);
			i++;	
		}
		System.out.println(sum);
	}

}
