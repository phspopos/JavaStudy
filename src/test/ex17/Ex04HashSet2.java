package test.ex17;

import java.util.HashSet;

import common.Teacher;

public class Ex04HashSet2 {

	public static void main(String[] args) {
		
		HashSet<Teacher> set = new HashSet<Teacher>();
		
		Teacher t1 = new Teacher("정우성", 40, "국어");
		Teacher t2 = new Teacher("황정민", 42, "영어");
		Teacher t3 = new Teacher("최민식", 44, "수학");
		
		set.add(t1);
		set.add(t2);
		set.add(t3);
		
		System.out.println("set의 크기 : " + set.size() );
		
		Teacher t4 = new Teacher("이정재", 40, "국어");
		
		System.out.println("t4저장여부 : " + set.add(t4));
		System.out.println("set의 크기 : " + set.size());
		
	}
}
