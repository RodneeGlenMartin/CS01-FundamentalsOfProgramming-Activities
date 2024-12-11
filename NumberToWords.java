import javax.swing.JOptionPane;

public class NumberToWords {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a whole number from 0-10:");

        try {
            int number = Integer.parseInt(input);

            if (number >= 0 && number <= 10) {
                String words = "";

                switch (number) {
                    case 0:
                        words = "Zero";
                        break;
                    case 1:
                        words = "One";
                        break;
                    case 2:
                        words = "Two";
                        break;
                    case 3:
                        words = "Three";
                        break;
                    case 4:
                        words = "Four";
                        break;
                    case 5:
                        words = "Five";
                        break;
                    case 6:
                        words = "Six";
                        break;
                    case 7:
                        words = "Seven";
                        break;
                    case 8:
                        words = "Eight";
                        break;
                    case 9:
                        words = "Nine";
                        break;
                    case 10:
                        words = "Ten";
                        break;
                }

                JOptionPane.showMessageDialog(null, "Number in words: " + words);
            } else {
                JOptionPane.showMessageDialog(null, "Error: Number not in range.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Invalid input. Please enter a whole number.");
        }
    }
}