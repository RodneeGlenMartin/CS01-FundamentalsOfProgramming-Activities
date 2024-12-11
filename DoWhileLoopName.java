import java.util.Scanner;

public class DoWhileLoopName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int i = 0;
        do {
            System.out.println(name);
            i++;

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.err.println("Error: Thread interruption occurred.");
            }
        } while (i < 100);

        scanner.close();
    }
}