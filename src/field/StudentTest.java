package field;

import person.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student();
		
		//private은 외부에서 접근 불가
		//s.id = 1;
		
		//protected는 같은 패키지에서 접근 가능 -> 신경안씀
		//protected는 같은 자식에서 접근 가능
		//s.name = "둘리"; [다른 패키지]
		
		//default는 같은 패키지에서"만" 접근 가능 -> 신경안씀
		//s.studentNumber = "0194-4543"; [다른 패키지]
		
		//public은 어디서든 접근 가능
		s.major = "Computer Science";
		
		
	}

}
