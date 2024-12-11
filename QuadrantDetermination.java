import java.util.Scanner;

public class QuadrantDetermination {                              
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter x-coordinate: ");
            int x = scanner.nextInt();

            System.out.print("Enter y-coordinate: ");
            int y = scanner.nextInt();

            if (x > 0 && y > 0) {
                System.out.println("The point lies in the first quadrant.");
            } else if (x < 0 && y > 0) {
                System.out.println("The point lies in the second quadrant.");
            } else if (x < 0 && y < 0) {
                System.out.println("The point lies in the third quadrant.");
            } else if (x > 0 && y < 0) {
                System.out.println("The point lies in the fourth quadrant.");
            } else {
                System.out.println("The point lies on an axis.");
            }
        }

        scanner.close();
    }
}