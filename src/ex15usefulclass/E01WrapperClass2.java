package ex15usefulclass;

/*
  parseInt() : 숫자형식의 문자열을 정수(숫자)로 변경한다.  
  parseDouble() : 실수로 변경한다.
 */
public class E01WrapperClass2 {
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt("100");
		String b = String.valueOf(100);
		int c = Integer.parseInt("500");
		String d = String.valueOf(500);
		
		System.out.println( a + " " +b + " " +c + " " +d );
		
		
		String strNumber = "1000";
		//정수 + 문자열 => 101000
		System.out.println("10 + strNumber =" + ( 10 + strNumber ));
		//정수 + 정수 => 1010
		System.out.println("10 + strNumber를 숫자로 변경 : " + (10 + Integer.parseInt(strNumber)));
		//위와 동일하게 문장열을 정수로 변경해줌
		System.out.println("10 + strNumber를 숫자로 변경 : " + (10 + Integer.valueOf(strNumber)));
		
		/*
		 문자열을 숫자로 변경시 반드시 숫자형식만 기술해야한다.
		 '원' 은 숫자가 아니므로 변경시 예외가 발생된다. 
		 */
		String money = "120원";
		//System.out.println("120원 : " + Integer.parseInt(money) ); //예외발생
		
		/*
		  실수형태의 문자열을 숫자로 변경할때는 parseInt()는 사용할 수 
		  없다. 앞과 동일한 예외가 발생
		 */
		String floatString = "3.14";
		//System.out.println( Integer.parseInt(floatString));
		
		/*
		Float.parseFloat(floatString);
		Double.parseDouble(floatString);
		Float.parseFloat( floatString );
		Double.parseDouble( floatString );
		*/
		
		System.out.println("실수형(float)형으로 변경 : " + Float.parseFloat(floatString));
		System.out.println("실수형(Double)형으로 변경 : " + Double.parseDouble(floatString));
		
		/*
		 Character 클래스의 주요메서드 
		 */
		
		/*
		 codePointAt() : 문자열에서 특정 index에 해당하는 한 문자의
		 아스키코드를 반환한다.
		 */
	
		System.out.println("ABCD에서 3번째 인덱스 D의 아스키코드");
		System.out.println( Character.codePointAt("ABCD", 3));
		
		/*
		 isDigit() : 인자로 전달된 문자가 숫자인지 판단한다. 숫자일때
		 true를 반환한다.
		 */
		
		System.out.println("isDigit()를 통한 숫자판단");
		System.out.println( Character.isDigit('A') ? "숫자임" : "숫자아님" );
		System.out.println( Character.isDigit(50) ? "숫자임" : "숫자아님");
		System.out.println( Character.isDigit('7') ? "숫자임" : "숫자아님");
		
		/*
		 isLetter() : 문자인지 여부를 판단하는 메서드로 특수기호나
		 숫자형일때는 false를 반환한다.
		 */
		System.out.println("isLetter() 메소드를 통한 문자판단");
		System.out.println( Character.isLetter('가') );
		System.out.println( Character.isLetter('A') );
		System.out.println( Character.isLetter('#') );
		System.out.println( Character.isLetter('9'));
		
		/*
		 isWhitespace() : 공백문자인지 판단하는 메서드. 공백문자일때
		 true를 반환한다.
		 */
		System.out.println("isWhitespace() 메소드로 공백문자 판단");
		System.out.println( Character.isWhitespace('A') );
		System.out.println( Character.isWhitespace(' ') );
		
		/*
		 isLowerCase() : 소문자인지 판단
		 isUpperCasea() : 대문자인지 판단. 단 영문이 아닌경우
		 					false를 반환한다.
		 */
		System.out.println("알파벳 대소문자 판단");
		System.out.println( Character.isLowerCase('A') );
		System.out.println( Character.isUpperCase('z') );
		System.out.println( Character.isLowerCase('a') );
		System.out.println( Character.isUpperCase('Z') );
		System.out.println( Character.isLowerCase('가') );
		
		
		
		
		
		
	}
	
}
