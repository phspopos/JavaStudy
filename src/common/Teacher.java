package common;

import java.util.Objects;

public class Teacher extends Person {

	private String subject;
	
	public Teacher() {}
	public Teacher( String name, int age, String subject ) {
		super( name, age );
		this.subject = subject;		
	}
	
	@Override
	public String toString() {
		return super.toString() + ", 과목 : " + subject;
	}
	
	@Override
	public int hashCode() {
		int returnCode1 = super.getAge() + this.subject.hashCode();
		int returnCode2 = Objects.hash(super.getAge(), this.subject);
		
		return returnCode2;
	}
	
	@Override
	public boolean equals( Object obj ) {
		Teacher teacher = (Teacher)obj;
		
		if( teacher.getAge() == super.getAge() 
				&& teacher.subject.equals(this.subject) ) {
			return true;
		
		}else {
			return false;
		}
	}	
	
}
