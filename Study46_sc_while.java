package Study0408;

import java.util.Scanner;

public class Study46_sc_while 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int i;
		int j = 1;
		
		System.out.print("원하는 단을 입력:");
		i = sc.nextInt();
		
		while (j < 10)
		{
			System.out.println(i + "x" + j + "=" + i*j);
			j++;	
		}
			
		
	}

}
