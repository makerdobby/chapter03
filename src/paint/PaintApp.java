package paint;

public class PaintApp {

	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(50);
		point1.setY(120);
		
		drawPoint( point1 );
		
		
		// point1.disappear();
		point1.show(false);
		
		Point point2 = new Point(50,10);
		
		/*
		 * 이거 왜 안될까
		 * Point point3 = new ColorPoint();
		 * point3.setColor("Blue");
		 */
		
		
		Point point3 = new ColorPoint(20,100,"blue");
		drawPoint(point3);		
		
		point3.show(false);
		point3.show(true); //자식에서 show를 오버라이드했으니까 색깔도 같이 나옴

	}
	
	
	private static void drawPoint(Point point) {
		point.show();
	}
	

}
