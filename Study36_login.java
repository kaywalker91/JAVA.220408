package Study0408;

import java.util.Scanner;

public class Study36_login 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String id = "eorkr112";
		String pw = "1234";
		
		String input =null;
		String input2 =null;
		
		System.out.print("ID을 입력하시오:");
		input = sc.nextLine();
		System.out.print("PW을 입력하시오:");
		input2 = sc.nextLine();
		
		if(input.equals(id))
		{
			if(input2.equals(pw))
			{
				System.out.println("로그인되었습니다!");
			}		
		}
		else
		{
			System.out.println("ID 혹은 PW을 확인하십시오!");
		}
		
	}

}
