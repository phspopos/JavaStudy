package ex18lambda;

interface ISchool1 {
	void studyLambda( String str );
}

class Student1 implements ISchool1 {
	
	@Override
	public void studyLambda( String str ) {
		System.out.println( str + "을(를) 공부합니다");
	}
}

public class Ex01NormalClass {
	
	public static void main(String[] args) {
		ISchool1 sch = new Student1();
		sch.studyLambda("람다식");
	}
	
}
