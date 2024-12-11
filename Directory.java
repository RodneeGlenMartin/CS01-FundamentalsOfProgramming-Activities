import javax.swing.JOptionPane;

public class Directory {
    public static void main(String[] args) {
        String[] names = new String[5];
        String[] phoneNumbers = new String[5];
        String[] addresses = new String[5];
        for (int i = 0; i < 5; i++) {
            names[i] = JOptionPane.showInputDialog("Enter Name " + (i + 1) + ":");
            phoneNumbers[i] = JOptionPane.showInputDialog("Enter Telephone Number " + (i + 1) + ":");
            addresses[i] = JOptionPane.showInputDialog("Enter Address " + (i + 1) + ":");
        }
        
        String directory = "";
        for (int i = 0; i < 5; i++) {
            directory += "Name: " + names[i] + "\n";
            directory += "Telephone No.: " + phoneNumbers[i] + "\n";
            directory += "Address: " + addresses[i] + "\n\n";
        }

        JOptionPane.showMessageDialog(null, directory);
    }
}
