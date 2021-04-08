package assignments.lab_1;

public class Question_3 {

	public static void main(String[] args) {
		specialEleven(22);
	}

	public static void specialEleven(int num1) {
		if (num1 % 11 == 0 || num1 % 11 == 1 || num1 % 11 == -10) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
