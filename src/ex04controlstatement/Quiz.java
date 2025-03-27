package ex04controlstatement;

public class Quiz {
	
	public static void main(String[] args) {
		
		/*
		퀴즈] 아래와 같은 모양을 출력하는 while문을 작성하시오.
			출력결과
				0 0 0 1
				0 0 1 0
				0 1 0 0
				1 0 0 0
		*/
		int i = 1;
		int num = 4;		
		while(i <= 4) {
			
			int j = 1;
			num = 4;
			
			while( j <= 4 ) {	
				
				
				if(  i == num ) {
					//System.out.print("들어온다.");
					//System.out.println(" i = " + i + " num = " + num);
					System.out.print("1");
				}else {
					System.out.print("0");									
				}
				
				num = num - 1;
				j++;
			
			}
	
			System.out.println();
			
			i++;		
		}
	}
}

