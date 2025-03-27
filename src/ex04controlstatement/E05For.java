package ex04controlstatement;

/*
	for문
		: while문과 같은 반복으로 초기값, 조건식, 증감식이 한줄에
		있어 반복의 회수를 명확히 알수있는 반복문이다.
		따라서 반복의 횟수가 정해져 있는 경우에 주로 사용한다.
		형식]
			for( 초기값; 조건식; 증감식 ){
				실행문장;
			}
 */

public class E05For {

	public static void main(String[] args) {
		
		//변수 i가 1~5까지 1씩 증가해서 5번 반복한다.
		for( int i = 0; i <= 5; i++ ) {
			System.out.println( "i = " + i );
		}
		
		/*
		 시나리오] 1~100까지의 합을 구하는 프로그램을 for문을 
		 이용하여 작성하시오
		 */
		
		//누적합 저장용 변수 선언
		int sum = 0;
		//초기값 1부터 100이하까지 반복
		for( int j = 1; j <= 100; j++ ) {
			//증가하는 j의 값을 변수에 누적해서 더함
			sum += j;
		}
		System.out.println( "1~100까지의 합" + sum );
		
		/*
		 시나리오] for문을 이용하여 1~10까지의 정수중에 2의 배수의
		 합을 구하는 프로그램을 작성하시오
		 */
		
		/*
		 방법1 : 1~10까지 10번 반복해서 if문을 통해 2의 배수를 
		 	찾은후 누적해서 더한다.
		 	
		 */
		
		int total = 0;
		
		for( int k = 1; k <= 10; k++ ) {
			
			if( k%2 == 0 ) {
				total += k;
			}			
		}
		
		System.out.println( "1~10사이 2의 배수의 합(방법1) : " + total );
		
		/*
		 방법2 : if문없이 초깃값을 0부터 시작하여 2씩 증가시킴
		 */
		total = 0;
		
		for( int x = 0; x <= 10; x+=2 ) {
			total += x;
		}
		
		System.out.println( "1~10사이 2의배수의합(방법2) : " + total);
		
		//for문으로 무한루프를 만들때는 (;;)와 같이 표현
		int a = 1;
		for(;;) {
			System.out.println("나는 for문으로 만든 무한 루프입니다." + a);
			a++;
			/*
			 무한루프는 기본적으로 에러가 발생된다. 그리고 해당 루프를 
			 탈출하지 못한다면 아래에 있는 코드는 실행될 수 없는 코드가
			 되므로 "Unreachable code" 라는 에러가 발생하게된다.
			 따라서 아래와 같이 탈출조건을 만들어 줘야 한다.
			 */
			
			if( a == 10 ) {
				break;				
			}
		}
		
		/*
		 for문의 끝에 ;을 사용하면 반복할 문장이 없는것으로 간주되어
		 for문과 상관없이 한번만 실행된다.
		 */
		
		for( int y = 0; y <= 5; y++ ); {
			System.out.println("어라.... 나는 누구? 여긴 어디");
		}
		
		/*
		 for문의 초기식에서 선언된 변수 j는 for문이 종료되는 순간
		 메모리에서 소멸된다. 여기서 사용된 변수 j는 지역변수(local 
		 varialble)라고 한다. 지역변수는 해당 지역을 벗어나면 즉시 
		 소멸되는 특징을 가지고 있다.
		 */
		//System.out.println("위 for문에서 선언한 변수 y = " + y);
		System.out.println("위 main함수 지역에서 선언한 total = " + total );
		
		
		/*
		 for문의 초기값은 외부(넓은지역, 여기서는 main지역)에서
		 선언하면 해당변수는 for문 내부(좁은지역)에서 사용할 수 있다.
		 즉 아래 선언한 변수 i는 main메서드의 지역변수로 선언되었다.
		 */
		
		int i = 0;
		for( ; i <=5; i++ ) {
			System.out.println( "for문 안에서의 i값 = " + i );
		}
		System.out.println( "for문 밖에서의 i값 = " + i );
		/*
		 Java에서는 중괄호가 나오면 하나의 지역이라 생각하면된다.
		 즉 if문, while문 등의 제어문에도 지역을 가지게 된다.
		 */
		
		
		
		
		
		
		
		
		
		
		
	}
}
