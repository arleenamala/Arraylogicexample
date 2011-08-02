package goglexample;

import java.util.Scanner;

public class Goglexample {
	/**
	 * @author arleen
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int input[] = { 1, 2, 3, 4, 5 };
		// gets the sum to be checked from user.
		Scanner sc = new Scanner(System.in);
		int comp = sc.nextInt();
		// intialising global variables
		int a = input[0];
		int b = input[1];
		int ans = 0;
		// the loop sums up every first element with every other element
		// omitting the
		// previously used first elements, assuming the array is in ascending
		// order
		// to compare with the sum provided.
		for (int i = 0; i < 5; i++) {

			int x;
			x = a + b;

			for (int i1 = i + 1; i1 < 5; i1++) {

				if (x == comp) {
					System.out
							.println("The atleast 1 pair that matches the search is"
									+ a + "," + b);
					ans = 1;
					break;
				} else {
					if (i1 < 4) {
						b = input[i1 + 1];
					}
					x = a + b;
				}
			}
			if (ans == 1)
				break;
			if (i < 4)
				a = input[i + 1];
		}
		if (ans == 0)
			System.out
					.println("There are no pairs that match the sum provided.");
	}
	// TODO get input array from user and sort before using in comparison.

}
