package Study0408;

import java.util.Scanner;

public class Study48_sc_do_while 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int score;
		
		do
		{
			System.out.print("������ �Է��Ͻÿ�(1~100��):");
			score = sc.nextInt();
			
		}while(!(score <= 100 && score > 1));
		
		System.out.print("�� ������ " + score + "�� �Դϴ�");
		
	}

}
