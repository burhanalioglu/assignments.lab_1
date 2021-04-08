package assignments.lab_1;

public class Question_2 {

	public static void main(String[] args) {
		love6(6, 16);

	}

	public static void love6(int num1, int num2) {
		if (num1 == 6 || num2 == 6) {
			System.out.println("true");
		} else if (num1 + num2 == 6) {
			System.out.println("true");
		} else if (Math.abs(num1 - num2) == 6) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}
}
