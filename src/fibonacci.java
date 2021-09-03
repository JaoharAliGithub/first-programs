import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the sequence length: ");
		int sequence = input.nextInt();
		fibonacci(sequence);
		input.close();
	}

	public static void fibonacci(int sequenceSize) {
		int start = 1;
		int nextNode = 0;
		int last1 = 1;
		int last2 = 0;
		System.out.print(start + " ");
		for (int i = 0; i < sequenceSize-1; i++) {
			nextNode = last1 + last2;
			System.out.print(nextNode + " ");
			last2 = last1;
			last1 = nextNode;

		}

	}
}
