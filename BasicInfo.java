import java.util.Scanner;

public class BasicInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String FullName = scanner.nextLine();

        System.out.print("Enter your email address: ");
        String EmailAddress = scanner.nextLine();

        System.out.print("Enter your contact number: ");
        String ContactNumber = scanner.nextLine();

        System.out.print("Enter your home address: ");
        String HomeAddress = scanner.nextLine();


        System.out.println("\nFull Name: " + FullName);


        System.out.println("Email Address: " + EmailAddress);


        System.out.println("Contact Number: " + ContactNumber);

 
        System.out.println("Home Address: " + HomeAddress);

        scanner.close();
    }
}