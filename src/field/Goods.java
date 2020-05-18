package field;

public class Goods {

		/*
		 * static 변수
		 */
		private static int countOfInstance=0;
		public static int getCountOfInstance() {
			// return name; => name은 static이 아니라서 접근이 안됨
			return  Goods.countOfInstance; //함수도 static이니까 Goods. 는 생략가능
		}
		
		
		private String name;
		private int price;
		private int countStock;
		private int countSold;
		
		public Goods() { //생성자 같이 함수가 있어야 클래스를 호출할 수 있음
			//생성자와 인스턴스 메소드에서는 클래스변수(static)는 이름으로 접근해야한다.
			//하지만 같은 클래스 안에선 생략이 가능.
			Goods.countOfInstance++;
		}
		
		public void setName(String n) {
			name = n;
		}
		public String getName() {
			return name;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			if(price < 0) { //이런 식으로 정보를 보호하려고 메소드를 씀
				price = 0;
			}
			this.price = price;//지금 내가 가진 그 price 에다가 값을 넣어주어라.
		}
		public int getCountStock() {
			return countStock;
		}
		public void setCountStock(int countStock) {
			this.countStock = countStock;
		}
		public int getCountSold() {
			return countSold;
		}
		public void setCountSold(int countSold) {
			this.countSold = countSold;
		}
		
		public void showInfo() {
			System.out.println(
					this.getName() + ":"+ 
					this.getPrice() + ":" +
					this.getCountStock() + ":" +
					this.getCountSold() );
		}

		public int calculateDiscountPrice(double discountRate) {
			return (int)(price*discountRate/100.0);
		}
		
		
		
}
