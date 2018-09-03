
public class Exam_01 {

	public static void main(String[] args) {
		byte a = -128; //숫자 -128부터 127까지만 가능
		short b = 32767; //숫자 -32768부터 32767까지만 가능
		
		b = 65; // 출력 : 65
		char c = 65; //아스키코드표 참고, 출력 : A
		
		//char c = 'A'; //음수를 표현하지 못하니까 65535까지 저장 가능, 음수는 절대 불가!
		System.out.println('b'-1); //97
		System.out.println("c");
		int d = 1000000000;
		long e = 10000000000L; //숫자 자체에 대한 평가를 내리지 못하므로, L을 사용
		float f = 3.14F;
		double g = 5.11;
		boolean h = true;  //false
		
		String i = "Hello";
	}

}
