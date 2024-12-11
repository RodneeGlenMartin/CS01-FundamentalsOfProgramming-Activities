import javax.swing.JOptionPane;

public class NameCounter {
    public static void main(String[] args) {
        String[] names = new String[10];

        for (int i = 0; i < names.length; i++) {
            names[i] = JOptionPane.showInputDialog("Enter name #" + (i + 1) + ":");
        }

        String nameToCount = JOptionPane.showInputDialog("Enter the name to count:");

        int count = 0;
        for (String name : names) {
            if (name.equals(nameToCount)) {
                count++;
            }
        }

        JOptionPane.showMessageDialog(null, "The name '" + nameToCount + "' appears " + count + " times in the list.");
    }
}
