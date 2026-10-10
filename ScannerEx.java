package ScannerPractice;
import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Addition of a+b:" + (a+b));
	}

}
