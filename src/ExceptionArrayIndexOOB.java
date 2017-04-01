import java.util.Scanner;

public class ExceptionArrayIndexOOB {
	public static void main(String[] args) {
		int len, val;
		char ans = 'N';
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the array:");
		len = sc.nextInt();
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			System.out.println("Value" + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		} // for i ends
		do {
			try {
				System.out
						.println("Value for which array index you want to look?");
				val = sc.nextInt();
				System.out.println("The value at index " + val + " is: "
						+ arr[val]);
				System.out.println();
				System.out.println("Do you want to continue (Y/N): ");
				ans = sc.next().charAt(0);
			} catch (ArrayIndexOutOfBoundsException ae) {
				ans = 'N';
				System.out.println("Array index out of bound exception: " + ae);
			} catch (Exception e) {
				ans = 'N';
				System.out.println("Array Error - " + e);
			}
		} while (ans == 'Y');
	}// main
}
