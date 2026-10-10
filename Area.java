import java.util.Scanner;

public class Area {
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length and Breadth of Rectangle");
		float l = sc.nextInt();
		float b = sc.nextInt();
		float area = l*b;
		System.out.println("area of rectangle:" + area);
	}

}
