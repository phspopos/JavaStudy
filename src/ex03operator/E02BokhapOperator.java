package ex03operator;

public class E02BokhapOperator {
	/*
	 복합대입연산자 : 산술연산자와 대입연산자를 연결해놓은 형태로
	 좌우측의 값을 연산하여 좌측의 변수에 대입하는 구조를 가진다.
	 문법의 구조상 현재의 타입을 유지하는 특성을 가지고 있다.
	 */
	public static void main(String[] args) {
		
		double e = 3.1;
		e += 2.1;
		e *= 2;
		e += e;
		//변수 e에 모든 연산의 결과가 누적되어 출력됨
		System.out.println("e의 결과 값 : " + e); // 20.8
		
		int n = 5;
		/*
		 정수와 실수를 연산하면 실수의 결과가 나오므로 n에 대입할 수 
		 없어 에러가 발생한다.
		 */
		//n = n * (2.7);
		n = (int)(n * 2.7);
		/*
		 위 구문을 정상적으로 처리하기 위해 아래와 같이 강제형변환
		 해야한다.
		 */
		
		/*
		 복합대입연산자를 사용하면 문법의 구조상 변수의 기존 자료형을 
		 그대로 유지한다. 따라서 연산의결과는 정수가 된다. 
		 */
		n *= 2.7;
		System.out.println("n의 결과 값 : " + n);
	}
	
}
