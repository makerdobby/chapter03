package method;

public class StaticMethod {
	int n;
	public static int m;
	
	void f1() {
		//인스턴스 메소드에서 인스턴스 변수 접근 O
		n = 1;
	}
	void f2() {
		// 인스턴스 메소드에서 클래스 변수 접근 O
		// StaticMethod.m = 3; 이 원칙- 단, 같은 클래스에서는 클래스 이름 생략가능
		m = 3; 
	}
	void f3() {
		//인스턴스 메소드에서 클래스 변수 접근 O
		//StaticMethod.s1(); 이 원칙- 단, 같은 클래스에서는 클래스 이름 생략가능
		s1();
	}
	static void s1() {
		//error : 인스턴스 메소드에서 인스턴스 변수 접근 X
		//n = 1;
	}
	
	static void s2() {
		// 인스턴스 메소드에서 클래스 변수 접근 O
		m = 3;
	}
	static void s3() {
		//error: 클래스 메소드에서 인스턴스 메소드 접근 X
		//f1();
	}
	static void s4() {
		//error: 클래스 메소드에서 클래스 메소드 접근 O
		s1();
	}
	
}
