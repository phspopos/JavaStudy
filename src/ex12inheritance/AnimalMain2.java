package ex12inheritance;

public class AnimalMain2 {
	
	public static void main(String[] args) {
		//강아지 객체생성
		Dog dog = new Dog("포유류",2,"수컷","포매라니안","뽀미");
		
		dog.showAnimal();
		System.out.println("222====================");
		dog.bark();
		System.out.println("222====================");
		dog.showDog();
	}

}