package assignments.lab_1;

public class Question_5 {

	public static void main(String[] args) {

		System.out.println(caughtSpeeding(60, false));
		System.out.println(caughtSpeeding(65, false));
		System.out.println(caughtSpeeding(65, true));
	}

	public static int caughtSpeeding(int speed, boolean isBirthday) {

		if (isBirthday) {
			if (speed > 85) {
				return 2;
			} else if (speed > 65 && speed <= 85) {
				return 1;
			} else {
				return 0;
			}
		} else {
			if (speed > 80) {
				return 2;
			} else if (speed > 60 && speed <= 80) {
				return 1;
			} else {
				return 0;
			}
		}

	}
}
