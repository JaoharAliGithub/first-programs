import java.util.Arrays;

public class SevenPointTwentyThree {

	public static void main(String[] args) {

		boolean[] L = new boolean[100];
		int main = 0;
		System.out.println(java.util.Arrays.toString(L));

		Arrays.fill(L, Boolean.TRUE);
		System.out.println(java.util.Arrays.toString(L));

		for (int Student = 2; Student < 100; Student++) {
			main = Student;
			for (main = Student; main < 100;) {

				if (L[main - 1] != true) {
					L[main - 1] = true;

				} else {
					L[main - 1] = false;
				}

				main += main - 1;
			}

		}
		for (int help = 0; help < 100; help++) {
			if (L[main-1] == true) {
				System.out.println(L[main-1]);
			}
			else {
				
			}
		}

	}
}