package field;

public class Swap {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;

		/*
		 * Stack에 생겼다가 의미없이 그냥 사라지는 swap
		 */
		System.out.println(i + ":" + j);
		swap(i, j);
		System.out.println(i + ":" + j);

		/*
		 *
		 */
		Value i2 = new Value();
		Value j2 = new Value();

		System.out.println(i2.getVal() + ":" + j2.getVal());
		swap(i2, j2);
		System.out.println(i2.getVal() + ":" + j2.getVal());

	}

	/*
	 * Call By Value
	 */
	public static void swap(int a, int b) { //ㅈㄴ 아무의미없음
		int temp = a;
		a = b;
		b = temp;
	}
	
	/*
	 * Call by reference (객체는 reference값을 저장하자너)
	 */
	public static void swap(Value a, Value b) { // 다형성
		int temp = a.getVal(); //temp는 stack에 있다가 이 함수가 끝나면 사라짐
		a.setVal(b.getVal());
		b.setVal(temp); 	   // a랑 b는 heap에 남아있음.
	}

}
