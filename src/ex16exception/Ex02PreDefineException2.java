package ex16exception;

import java.util.Scanner;

public class Ex02PreDefineException2 {

	public static void main(String[] args) {
		
		/*
		 정수를 입력해야 하는데 문자 혹은 문자열을 잘못 입력한 경우에
		 발생되는 예외. nextInt()에서 발생한다. 
		 */
		System.out.println("### NumberFormatException ###");
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			/*
			  입력시 정수가 아닌 문자 혹은 문자열을 입력하면 정수로 변환이 
			  불가능 하므로 예외가 발생된다.
			 */
			System.out.println("나이를 입력하세요");
			String strAge = scanner.nextLine();
			int ageAfter10 = Integer.parseInt( strAge ) + 10;
			System.out.println("당신의 10년후 나이는 : " + ageAfter10);
			
		}catch( NumberFormatException e ) {
			System.out.println("나이는 숫자로만 입력해야 합니다.");
			System.out.println("예외메세지 : " + e.getMessage());
			e.printStackTrace();
		}
	}
}
