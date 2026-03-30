/**
 * File: More Functions
 * Author: Leo
 * Date Created: Mar 30, 2026
 * Date Last Modified: Mar 30, 2026
 */

public class PracticeProblem {

	public static void main(String args[]) {
	}

	public static boolean isEven(int num) {
		boolean num1 = (num % 2) == 0;
		return num1;
	}

	public static boolean isOdd(int num) {
		boolean num1 = (num % 2) != 0;
		return num1;
	}

	public static boolean isPositive(int num) {
		boolean num1 = (num > 0);
		return num1;
	}

	public static boolean isNegative(int num) {
		boolean num1 = (num < 0);
		return num1;
	}

	public static int combinedLength(String word1, String word2) {
		String word = word1 + word2;
		int length1 = word.length();
		return length1;

	}
}
