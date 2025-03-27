package ex04controlstatement;

public class Quiz4DoWile {

	/*
	퀴즈) 다음과 같은 피라미드를 출력하는 프로그램을 
		do~while문으로 작성하시오.
	 *
	 **
	 ***
	 ****
	 *****
	*/

	public static void main(String[] args) {
		
//		int i = 1;
//		int j = 1;
//		//int k = 5;
//		
//		do {
//			
//			while(  j <= 5 ) {
//								
//				System.out.print("*");
//				
//				j++;
//			}
//			System.out.println();
//			
//						
//			i++;
//			
//		}while(i <= 5);
		
		//1.행을 위한 반복문 생성
		int a = 1;
		
		do {
			
			//2.열을 위한 반복문 생성
			int b = 1;
			
			do {
				//3.반복문확인
				System.out.print("*");
				
				b++;
			
				//행에 해당하는 a의 갯수만큼만 *를 출력한다.
			}while( b <= a ); 
			
			//4. 5개 출력후 줄바꿈
			System.out.println();
			
			a++;
			
		}while( a <= 5 ); 
		
		
		System.out.println("==================");
		
		int i = 1;
		
		do {
			
			int j = 5;
			
			do {
				
				System.out.print("*");				
				j--;
				
			}while( j >= i );
			
			System.out.println();
			
			i++;
		}while( i <= 5 );

		System.out.println("~~~ if문으로 구현하기 ~~~");
		
		int n = 1;
		
		do {
			
			int m  = 1;
			
			do {
				
				// i의 크기만큼 반복해서 *를 출력한다.
				if( n >= m ) {
					System.out.print("* ");					
				}
				
				m++;
				
			}while( m <= 5 );
			
			System.out.println();
			
			n++;
		}while( n <= 5 );		
		

	}
}
