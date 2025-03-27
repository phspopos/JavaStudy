package ex07string;

public class E02StringMethod4 {
	
	public static void main(String[] args) {
		/*
		시나리오1] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		
		String male ="190419-3000000";
		String female = "190419-4000000";
		
		char str = male.charAt(7);
		System.out.println(str);
		
		if( str == '3' ) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		
		//System.out.println( (int)male.charAt(7) == 3 ? "남자" : "여자"  );
		
		
			
		/*
		시나리오2] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/

		String str2 = "hong@daum.net";
		
		if( str2.contains("@") ) {
			
			if( str2.contains(".") ) {
				System.out.println("이메일 형식이 맞습니다.");
			}else {
				System.out.println("이메일 형식이 아닙니다.");
			}
			
		}else {
			System.out.println("이메일 형식이 아닙니다.");
		}
		
		String str3 = "not@naver";
		
		/*
		시나리오3]주민등록번호로 성별을 구분하는 프로그램을 indexOf()와 charAt()을 
		이용해서 작성하시오.
		*/	
		
		//190419-3000000
		//System.out.println( male.indexOf(7) );

		int a = male.indexOf('-') + 1 ;
		System.out.println("a = " + a);
		
		char b = male.charAt(a);
		System.out.println("b = " +  b);
		
		if( b == '3' ) {
			System.out.println("남성입니다.");
		}else {
			System.out.println("여성입니다.");
		}
		

		/*
		시나리오4] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
		
		String str4 = "my.file.images.jpg";
		
		System.out.println( str4.lastIndexOf(".") );
		
		int check = str4.lastIndexOf(".") + 1;
		System.out.println( "확장자 : " + str4.substring(check) );

		
		
		
		
	}
	

}
