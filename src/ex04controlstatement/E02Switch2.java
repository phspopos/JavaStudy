package ex04controlstatement;

public class E02Switch2 {

	/*
	시나리오] 국,영,수 점수의 평균값을 구하여 학점을 출력하는
		프로그램을 작성하시오. 90점이상은 A학점...
		60점 미만은 F학점을 출력하면 된다. 
		단, switch문으로 작성하시오. 
	 */
	
	public static void main(String[] args) {
		//정수타입으로 점수를 할당
		int kor=90, eng=93, math=95;
		
		/*
		 Java에서는 switch문에 조건식을 사용할수 없으므로 평균점수의
		 구간을 아래와 같이 10으로 나눈 몫을 통해 구해야한다.
		 */
		int avg = ((kor+eng+math) / 3) / 10;
		
		switch(avg) {
			case 10: case 9:
				System.out.println("A학점");	break;
			case 8:
				System.out.println("B학점"); break;
			case 7:
				System.out.println("C학점"); break;
			case 6:
				System.out.println("D학점"); break;
			default : 
				System.out.println("F학점");
		}	
		
	}
}
