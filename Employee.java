package control_statements;
import java.util.Scanner;

public class Employee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Written Test marks: ");
        int written = sc.nextInt();

        System.out.print("Enter Coding Test marks: ");
        int coding = sc.nextInt();

        System.out.print("Enter Communication marks: ");
        int communication = sc.nextInt();

        System.out.print("Enter Final Interview marks: ");
        int interview = sc.nextInt();

        if (written < 50) {
            System.out.println("Rejected in Written Test.");
        } else if (coding < 50) {
            System.out.println("Rejected in Coding Test.");
        } else if (communication < 50) {
            System.out.println("Rejected in Communication Round.");
        } else if (interview < 50) {
            System.out.println("Rejected in Final Interview.");
        } else {
            System.out.println("Congratulations! You are hired.");
        }

        sc.close();
    }
}
