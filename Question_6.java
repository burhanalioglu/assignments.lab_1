package assignments.lab_1;

public class Question_6 {

	public static void main(String[] args) {
		cigarParty(30, false);
		cigarParty(50, false);
		cigarParty(70, true);

	}

	public static void cigarParty(int cigars, boolean isWeekend) {
		if (isWeekend) {
			if (cigars >= 40) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}

		} else {
			if (cigars >= 40 && cigars <= 60) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		}
	}
}
