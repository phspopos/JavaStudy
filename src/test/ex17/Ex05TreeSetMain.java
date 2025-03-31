package test.ex17;

import java.util.Iterator;
import java.util.TreeSet;

class MyString implements Comparable<MyString> {

	String str;
	
	public MyString( String str ) {
		this.str = str;
	}
	
	public int getLength() {
		return str.length();
	}	
	
	
	@Override
	public int compareTo( MyString paramStr ) {
		
		if( getLength() > paramStr.getLength() ) {
			return 1;
		
		}else if( getLength() < paramStr.getLength() ) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
	@Override
	public String toString() {
		return str;
	}
		
}


public class Ex05TreeSetMain {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(1);
		tree.add(4);
		tree.add(2);
		tree.add(3);
		tree.add(2);
		
		System.out.println("저장된 데이터 수 : " + tree.size() + "개");
		
		Iterator<Integer> it = tree.iterator();
		
		while( it.hasNext() ) {
			System.out.print( it.next() + " ");
		}		
		System.out.println();
		
		/****************************************/
		
		TreeSet<MyString> tree2 = new TreeSet<MyString>();
		tree2.add( new MyString("Orange") );
		tree2.add( new MyString("Apple") );
		tree2.add( new MyString("Moon") );
		tree2.add( new MyString("JavaWeb") );
		
		Iterator<MyString> it2 = tree2.iterator();
		
		while( it2.hasNext() ) {
			System.out.print(it2.next() + " ");
		}
		System.out.println();
		
				
				
				
				
				
				
				
				
				
				
				
				
	}
	
}
