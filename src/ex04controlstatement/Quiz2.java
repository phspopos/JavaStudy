package ex04controlstatement;

public class Quiz2 {

	/*
	퀴즈] 아래와 같은 모양을 출력하는 while문을 작성하시오.
		출력결과
			0 0 0 1
			0 0 1 0
			0 1 0 0
			1 0 0 0
	*/
	
	public static void main(String[] args) {
		
		int i = 1;
		int num = 4;
		
		while( i <= 4 ) {
			
			int j = 1;
			
			while( j <= 4) {
				
				if( j == num ) {
					System.out.print("1");
				}else {
					System.out.print("0");
				}
				
				j++;
			}
			System.out.println();
			num = num -1;
			i++;			
		}
		
	}
}
