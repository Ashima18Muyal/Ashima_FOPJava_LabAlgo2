package transaction;
import java.util.Scanner;
public class Transaction {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the transaction array: ");
		int size = scanner.nextInt();
		int[] transactions = new int[size];

		System.out.print("Enter the values of the array: ");
		for (int i = 0; i < size; i++) {
			transactions[i] = scanner.nextInt();
		}

		System.out.print("Enter the total number of targets that need to be achieved: ");
		int numTargets = scanner.nextInt();

		for (int i = 0; i < numTargets; i++) {
			System.out.print("Enter the value of the target: ");
			int target = scanner.nextInt();
			String result = achieveTarget(transactions, target);
			System.out.println(result);
		}
	}

	public static String achieveTarget(int[] transactions, int target) {
		int achievedTransactions = 0;
		int cumulativeSum = 0;

		for (int i = 0; i < transactions.length; i++) {
			cumulativeSum += transactions[i];

			if (cumulativeSum >= target) {
				achievedTransactions = i + 1;
				break;
			}
		}

		if (achievedTransactions == 0) {
			return "Target is not achieved";
		}

		return "Target achieved after " + achievedTransactions + " transactions";
	}
}
