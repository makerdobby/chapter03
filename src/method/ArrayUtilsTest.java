package method;

public class ArrayUtilsTest {

	public static void main(String[] args) {
		int [] a = {10,20,30,40};
		
		double[] d = ArrayUtils.intToDouble(a);
		
		for(double v:d) { //forEach 문
			System.out.println(v);
		}
		
		int[] a2 = ArrayUtils.doubleToInt(d);
		
		for(int v2 : a2) {
			System.out.println(v2);
		}
		
		int[] a3 = ArrayUtils.concat(a,a2);
		
		for(int v3 : a3) {
			System.out.println(v3);
		}
	}	
}
