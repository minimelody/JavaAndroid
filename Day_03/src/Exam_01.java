
public class Exam_01 {

	public static void main(String[] args) {
		byte a = -128; //���� -128���� 127������ ����
		short b = 32767; //���� -32768���� 32767������ ����
		
		b = 65; // ��� : 65
		char c = 65; //�ƽ�Ű�ڵ�ǥ ����, ��� : A
		
		//char c = 'A'; //������ ǥ������ ���ϴϱ� 65535���� ���� ����, ������ ���� �Ұ�!
		System.out.println('b'-1); //97
		System.out.println("c");
		int d = 1000000000;
		long e = 10000000000L; //���� ��ü�� ���� �򰡸� ������ ���ϹǷ�, L�� ���
		float f = 3.14F;
		double g = 5.11;
		boolean h = true;  //false
		
		String i = "Hello";
	}

}
