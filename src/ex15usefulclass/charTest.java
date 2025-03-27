package ex15usefulclass;

/*
 String whiteString =""; 
 */



public class charTest {

	public static void main(String[] args) {

		String whiteString ="h   e l   l   o ";
		//문자열을 char형 배열로 반환
		char[] chArr = whiteString.toCharArray();
		
		//카운트용 변수
		int whiteCnt = 0;
		
		//배열의 크기만큼 반복
		for( int i = 0; i < chArr.length; i++ ) {
			//i번째 문자가 공백인지 확인
			if( Character.isWhitespace(chArr[i]) == true ) {
				//공백문자로 판단되면 1증가
				whiteCnt++;
			}
		}
		
		System.out.println("총공백수 : " + whiteCnt);
		
		
		String a = " 하  이  루 ";
		char[] ch = a.toCharArray();
		int num = 0;
		for( int i = 0; i < ch.length; i++ ) {
			if( Character.isWhitespace(ch[i]) == true ) {
				num++;
			}
		}
		
		System.out.println("공백수" + num);
		
		
		String str = "하  나  둘  셋  넷  ";
		int sum = 0;
		int j = 0;		
		char[] ch2 = str.toCharArray();
		char[] ch3 = new char[10];
				
		for( int i = 0; i < ch2.length; i++ ) {
			
			if( Character.isWhitespace(ch2[i]) == true ) {
				sum++;				
			}else {
				
				ch3[j] = ch2[i];
				j++;
			}
			
		}
		System.out.println("공백의 수 : " + sum);
		
		String str2 = "";
		for( int i = 0; i < ch3.length; i++ ) {
						
			if( ch3[i] != ' ' ) {
				System.out.print(ch3[i]);
				str2 += ch3[i]+"";
			}			
		}
		System.out.println("str2 = " + str2);
		
		//String.valueOf() 메서드에 매개변수로 char[] 또는 char 를 넣으면 String으로 변환해준다.

		char[] charArray = {'a','b','c','d'};
		String toString = String.valueOf(charArray); // String toString = "abcd";
		//두번째 방법. toString()
		//toString() 메서드에 매개변수로 char를 넣으면 String으로 변환해준다. (char[]은 안됨)

		char ch5 = 'a';
		String stg = Character.toString(ch5);
		
		String str4 = String.valueOf(charArray);
		System.out.println(str4 + " = " +Character.toString(ch5));
		
		
	}

}
