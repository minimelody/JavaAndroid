
public class Operator {
	public static void main(String [] args) {
		int x = 10;
		int y = 20;
		boolean result;
		int result2;
		result2 = x + y;
		System.out.println(x + " + " + y + " = " + result2); //10 + 20 = 30
		x = y = 2;
		System.out.println("x = " + x++ + ", y = " + ++y); //x = 2, y = 3
		System.out.println("x = " + x + ", y = " + y); //x = 3, y = 3
		y = 10;
		
		result = !( ((x>y) || (y==x)) || ((x!=y) && (x<y) ));
		System.out.println(result); //false
	}
}
