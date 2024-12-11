import java.util.Scanner;

public class WhileLoopName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int i = 0;
        while (i < 100) {
            System.out.println(name);
            i++;

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.err.println("Error: Thread interruption occurred.");
            }
        }

        scanner.close();
    }
}