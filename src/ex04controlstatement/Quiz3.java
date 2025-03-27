package ex04controlstatement;

public class Quiz3 {

	public static void main(String[] args) {
		
		int i = 4;		
		
		while( i > 0 ) {
			
			int j = 1;
			
			while( j <= 4) {
				
				if( j == i ) {
					System.out.print("1");
				}else {
					System.out.print("0");
				}
				
				j++;
			}
			System.out.println();
			
			i--;			
		}
	}
}
