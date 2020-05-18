package field;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		
		//camera.name = "nikon";
		camera.setName("Nikon");
		
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold (50);

		
		/*
		 * System.out.println(
				camera.getName() + ":"+ 
				camera.getPrice() + ":" +
				camera.getCountStock() + ":" +
				camera.getCountSold() );	
		*/
	
		//void function( ){}
		camera.showInfo();
		
		//int function( double ){}
		//이 문장을 먼저 쓰고 정의하는게 편함. 빨간줄 누르면 정의되거든
		int discountPrice = camera.calculateDiscountPrice(20.5);
		System.out.println(discountPrice);
		/*
		 * static변수 활용
		 */
		Goods goods1 = new Goods();
		Goods goods2 = new Goods();
		
		System.out.println(Goods.getCountOfInstance());
		
	}

}
