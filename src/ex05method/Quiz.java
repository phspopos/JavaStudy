package ex05method;

import java.util.Scanner;

/*
퀴즈] 사용자로부터 2~9사이의 숫자중 2개를 입력받아 이에 해당하는 구구단을 출력하는 메서드를 작성하시오. 무조건 첫번째 입력받는수가 작아야한다.
입력예]
	첫번째숫자 : 3
	두번째숫자 : 12
	3*1=3 3*2=6........
	........
	...................12*9=108
메서드명 : inputGugudan(int sNum, int eNum)
 */


public class Quiz {

	static void inputGugudan( int sNum, int eNum ){
		
		//int sum = 0;
		
		for( int i = sNum; i <= eNum; i++ ) {
			for( int j = 1; j <= 9; j++ ) {
				System.out.printf(" %2d * %2d = %3d  |", i, j, ( i * j  ) );
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("시작점을 입력하세요");
			int num1 = sc.nextInt();
			System.out.print("끝점을 입력하세요");
			int num2 = sc.nextInt();
			
			if( num1 < num2 && num1 != 0 && num1 > 0 ) {
				inputGugudan( num1, num2 );
				break;
			}else {
				System.out.println("시작점이 클수가 없고 0과 -를 입력하실수 없습니다. 다시 입력해주세요");
				System.out.println();
			}
			
		}
		
		sc.close();
		
	}
}
