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
		
		System.out.print("ID�� �Է��Ͻÿ�:");
		input = sc.nextLine();
		System.out.print("PW�� �Է��Ͻÿ�:");
		input2 = sc.nextLine();
		
		if(input.equals(id))
		{
			if(input2.equals(pw))
			{
				System.out.println("�α��εǾ����ϴ�!");
			}		
		}
		else
		{
			System.out.println("ID Ȥ�� PW�� Ȯ���Ͻʽÿ�!");
		}
		
	}

}
