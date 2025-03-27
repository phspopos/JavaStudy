package ex05method;

public class E09RecursiveMethod {

	static int factorial(int number) {
		int result = 0;
		
		if(number == 1) {
			result = 1;	
		}else {
			result = number * factorial(number - 1);
		}
		
		System.out.println("계산과정:number = " + number + ", result = " + result);
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("재귀함수를 이용한 팩토리어 구하기");
		System.out.println("4factorial : " + factorial(4));
		System.out.println("10factorial(10) : " + factorial(10));
	}
}
