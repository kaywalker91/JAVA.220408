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
			System.out.print("점수를 입력하시오(1~100점):");
			score = sc.nextInt();
			
		}while(!(score <= 100 && score > 1));
		
		System.out.print("내 점수는 " + score + "점 입니다");
		
	}

}
