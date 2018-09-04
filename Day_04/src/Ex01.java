
public class Ex01 {

	public static void main(String[] args) {
		/*
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40L;
		float f = 3.14f;
		
		double d = 5.11;
		
		s = b;  //b = s?
		i = s;  //s = i?
		l = i;  //i = l?
		d = f;  //f = d?
		*/
		
		short a = 1000;
		
		byte b = (byte)a;  // Casting (강제 형 변환)
		System.out.println(b);
	}

}
