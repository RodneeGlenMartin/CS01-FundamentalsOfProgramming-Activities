import java.util.Scanner;

public class ForLoopName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        for (int i = 0; i < 100; i++) {
            System.out.println(name);
            
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.err.println("Error: Thread interruption occurred.");
            }
        }

        scanner.close();
    }
}