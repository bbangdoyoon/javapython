package ex0711;//오버로딩 기법

public class AA {
	
	void doA() {
		System.out.println("doA");
	}
	void doA(int a) {
		System.out.println("doA a = " +a);		
	}
	void doA(int a, int b) {
		System.out.println("doA a = " +a);
		System.out.println("doA b = " +b);
	}

}
