package ex10accessmodifier;

/*
 해당 클래스는 sub 패키지에 작성되었으므로 상용을 위해서는 반드시
 import 해야한다. 
 */
import ex10accessmodifier.sub.E01AccessModifier2;

public class E01AccessModifierMain {

	public static void main(String[] args) {
	
		System.out.println("E01AccessModifier1 객체 생성 및 접근");
		
		/*
		 동일한 패키지에 선언된 클래스이므로 import 업이 인스턴스를 
		 생성할 수 있다. 
		 */
		E01AccessModifier1 one = new E01AccessModifier1();
		
		/*
		 private 으로 선언된 멤버는 동일한 패키지에 선언하더라도
		 접근할 수 없다. 유일하게 동일한 클래스 내부에서만 접근을
		  허용한다. 
		 */		
		//System.out.println("one.privateVar = " + one.privateVar);
		System.out.println("one.defaultVar = " + one.defaultVar);
		System.out.println("one.publicVar = " + one.publicVAr );
		
		//멤버메서드도 변수와 동일한 접근 범위를 가진다.
		//one.privateMethod(); //에러발생
		/*
		 private 으로 선언된 멤버에 외부클래스에서 접근 하려면 default
		 혹은 public 으로 선언되어 외부접근이 가능한 메서드를 통해
		 간접적으로 접근해야한다. 클래스 내부에서는 접근지정자의 영향을
		 받지 않으므로 해당 메서드를 통해 접근이 가능해진다. 
		 */
		one.defaultMethod();
		one.publicMethod();
	
		/*
		 동일한 패키지에 선언된 클래스이므로 import없이 인스턴스
		 생성이 가능하다. 또한 default 클래스는 동일한 패키지 내에서
		 접근할 수 있다.
		 */
		System.out.println("DefaultClass 객책의 생성및 접근");
		new DefaultClass1().myFunc();
		
		System.out.println("///////////////////////////////////////");
		/////////////////////////////////////////////////////
		
		System.out.println("E01AccessModifier2 객체 생성 및 접근");
		
		/*
		  다른 패키지에 선언된 클래스이므로 인스턴스 생성을 하려면 import
		  선언을 해야한다. 또한 패키지가 다르면 private, default
		  멤버는 접근할 수 없다. 
		 */
		E01AccessModifier2 two = new E01AccessModifier2();
		
		//System.out.println("two.privateVar = " + two.privateVar);
		//System.out.println("two.defaultVar = " + two.defaultVar);
		System.out.println("two.publicVar = " + two.publicVar);
		
		//two.privateMethod();
		//two.defaultMethod();
		two.publicMethod();
		
		/*
		 다른 패키지에 선언된 디폴트 클래스이므로 인스턴스 생성이
		 불가능하다. import 자체가 불가능 하므로 아예 사용할 수 없는
		 클래스가 된다. 
		 */
		System.out.println("DefaultClass2  객체 생성 및 접근");		
		//new DefaultClass2().myFunc();
		
		
		
	}
}
