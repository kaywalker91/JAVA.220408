package Study0408;

public class Study47_while 
{

	public static void main(String[] args) 
	{
		//1000 �̸��� �ڿ������� 3�� ����� 5�� ����� ������ ���϶�.
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
