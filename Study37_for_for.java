package Study0408;

import java.util.Scanner;

public class Study37_for_for 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int dan;
			
		System.out.print("원하는 단을 입력:");
		dan = sc.nextInt();
		
		for(int su=1; su<10; su++)
		{
			System.out.println(dan + " x " + su + " = " + (dan*su));
		}
	}

}
