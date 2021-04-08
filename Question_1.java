package assignments.lab_1;

public class Question_1 {

	public static void main(String[] args) {
		stringTimes("Hi", 5);
	}

	public static void stringTimes(String str, int times) {
		if (times > 0) {
			for (int i = 1; i <= times; i++) {
				System.out.print(str);
			}
		} else {
			System.out.println("The number you gave is not positive");
		}

	}
}
