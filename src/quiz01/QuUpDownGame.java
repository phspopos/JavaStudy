package quiz01;

import java.util.Random;
import java.util.Scanner;

/*
 업다운게임
quiz 패키지에 작성하세요.
파일명 : QuUpDownGame.java
컴퓨터는 1~100사이의 숫자 하나를 생성한다.
총 시도횟수는 7번을 부여한다.
사용자는 7번의 시도안에 숫자를 맞춰야 한다.
사용자가 숫자를 입력했을때 컴퓨터는 높은지/낮은지 알려준다.
7번안에 맞추면 성공, 맞추지 못하면 실패라고 출력한다.
성공/실패 후 계속 할지를 물어보고 1이면 게임 재시작, 0이면 프로그램을 종료한다.
메서드를 사용하여 구현한다.
실행결과]
생성된난수:36
1~100사이의 정수를 입력하세요:99
Down입니다.
1~100사이의 정수를 입력하세요:11
Up입니다.
1~100사이의 정수를 입력하세요:36
정답입니다.
승리하셨습니다.
게임을 다시 시작할까요?
1.게임재시작, 0:게임종료
0
감사합니다. 프로그램을 종료합니다.

※생성된 난수를 출력하는 이유는 빠른 테스트를 위한 부분입니다. 


  
 */
public class QuUpDownGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		int com = 0;
		int count = 1;
		
		while( true ) {
		
			if( count == 1) {
				com = r.nextInt(100) + 1;
			}
			
			System.out.println("com = " + com);			
			
			System.out.print("숫자를 입력하세요 : ");
			int player = sc.nextInt();
			
			if( com == player ) {
				System.err.println("승리 맞췄습니다.");
				count = 8;
				
			}else if( com < player ) {
				System.out.println("다운");
				count++;
			
			}else if( com > player) {
				System.out.println("업");
				count++;
			}			
				
			if( count == 8 ) {
			
				System.out.println("게임종료");
				System.out.print("뉴게임 1  종료 0 : ");
				int num = sc.nextInt();
				
				if( num == 1 ) {
					count = 1;
					System.out.println("새롭게 시작합니다.");
					continue;
				}else if( num == 0 ) {	
					System.out.println("종료합니다.");
					break;
				}
			}
			
		}	
		
		
	}
}
