package test;


abstract class PersonStorage {
	public abstract void add( String jumin, String name );
	public abstract String search( String jumin );
}

class PersonDTO{
	
	private String jumin;
	private String name;
	
		
	public PersonDTO( String jumin, String name ) {
		this.jumin = jumin;
		this.name = name;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	
}

class PersonNumber extends PersonStorage {

	PersonDTO[] personArr;
	int num;
	
	public PersonNumber( int arrSize ) {
		personArr = new PersonDTO[arrSize];
		num = 0;
	}
	

	@Override
	public void add(String jumin, String name) {
		
		System.out.println( jumin + " " + name);
		personArr[num] = new PersonDTO(jumin, name);
		num++;		
		
	}

	@Override
	public String search(String jumin) {
		
		for( int i = 0; i < num; i++ ) {
			if( jumin.compareTo( personArr[i].getJumin() ) == 0  ) {
				return personArr[i].getName();
			}
		}
		
		return null;
	}
	
}

public class E02AbstractToInterface1_2 {
	public static void main(String[] args) {
		PersonStorage storage = new PersonNumber(10);
		storage.add("123456-7894561", "김태희");
		storage.add("456123-4523698", "정우성");
		
		System.out.println(storage.search("123456-7894561"));
		System.out.println(storage.search("456123-4523698"));
		System.out.println(storage.search("123456-1234567"));
				
		
	}
}
