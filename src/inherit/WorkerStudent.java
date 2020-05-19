package inherit;

import person.Student;

public class WorkerStudent extends Student {
	public void test() {
		//protected는 자식 클래스에서만 접근가능
		name = "마이콜";
		
		//private은 자식 클래스에서 접근할 수 없다.
		//부모도 사생활이 필요해!
		//id = 10;
		
		//public은 자식클래스에서 접근 가능!
		major = "영어영문학과";
		
		//default는 같은 패키지에서만 접근 가능
		//studentNumber = 1123;
	}
	
}
