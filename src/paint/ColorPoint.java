package paint;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint ( int x, int y, String color ){
		setX(x);
		setY(y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override //코드는 아니고 알려주는거임 컴파일러한테 anotation 꼭 써야됨. Source > override/implement method
	public void show() {
		
		//super.show(); 
			// this. 는 자기 객체 참조
			// super. 는 부모 객체 참조
		//하지만 우린 완전 재구현 
		System.out.println("점 [x="+super.getX()+", "
							+ "y="+getY()
							+", color="+color+"]을 그렸습니다.");
		
	}
	
	

}
